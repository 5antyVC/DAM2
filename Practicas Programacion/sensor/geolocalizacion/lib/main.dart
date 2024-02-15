import 'package:flutter/material.dart';
import 'package:geolocator/geolocator.dart';
import 'package:geocoding/geocoding.dart';
import 'package:permission_handler/permission_handler.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Flutter Demo Home Page'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  Position? _posicionActual;
  String _direccionActual = "";

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            ElevatedButton(
                onPressed: _dameMiLocalizacion,
                child: Text("Actualizame donde estoy!")),
            if (_posicionActual != null) Text(_direccionActual),
            Text(
                "Lat:  ${_posicionActual?.latitude}  Long: ${_posicionActual?.longitude}"),
          ],
        ),
      ),
    );
  }

  _dameMiLocalizacion() async {
    if (await Geolocator.isLocationServiceEnabled()) {
      if (await Permission.location.status.isGranted) {
        print('Permiso concedido');
        if (await Permission.location.serviceStatus.isEnabled) {
          print('permiso habilitado');
          Geolocator.getCurrentPosition(
                  desiredAccuracy: LocationAccuracy.best,
                  forceAndroidLocationManager: true)
              .then((Position position) {
            setState(() {
              _posicionActual = position;
              _dameMiDireccionLegible();
            });
          });
        } else {
          print('No hay permiso habilitado');
          openAppSettings();
        }
      } else {
        print('No hay permiso concedido');
      }
    }
    else{
              print('GPS DESACTIVADO ACTIVALO');

    }
  }

  _dameMiDireccionLegible() async {
    try {
      List<Placemark> direcciones = await placemarkFromCoordinates(
        _posicionActual!.latitude,
        _posicionActual!.longitude,
      );
      Placemark lugar = direcciones[0];
      setState(() {
        _direccionActual =
            " ${lugar.street}, ${lugar.name}, ${lugar.postalCode}, ${lugar.locality}, ${lugar.subLocality}, ${lugar.country}, ";
        print(_direccionActual);
      });
    } catch (e) {
      print("Problemas...");
      print(e);
    }
  }
}
