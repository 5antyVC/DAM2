import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

void main() {
  

  runApp(MyApp());
}

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => _MyAppState();
}

class _MyAppState extends State<MyApp> {
  String telefono_1 = "666555777";
  String nombre_1 = "Mi Mujer";

  String telefono_2 = "777888999";
  String nombre_2 = "Mi Padre";

  String telefono_3 = "999101010";
  String nombre_3 = "Mi Madre";

  

  

  void _initState() {
    super.initState();
    _cargarTelefonos();
  }

  void _cargarTelefonos() async {
    SharedPreferences shPrefs = await SharedPreferences.getInstance();

    shPrefs.setString("nombre_1", "pepe");
    shPrefs.setString("telefono_1", "666777999");

    shPrefs.setString("nombre_2", "pepa");
    shPrefs.setString("telefono_2", "999999999");

    shPrefs.setString("nombre_3", "pepi");
    shPrefs.setString("telefono_3", "900000000");
  }

  void _guardarTelefonos() async {
    SharedPreferences shPrefs = await SharedPreferences.getInstance();
    setState(() {
      nombre_1 = shPrefs.getString("nombre_1") ?? "";
      telefono_1 = shPrefs.getString("telefono_1") ?? "";

      nombre_1 = shPrefs.getString("nombre_2") ?? "";
      telefono_2 = shPrefs.getString("telefono_2") ?? "";

      nombre_1 = shPrefs.getString("nombre_3") ?? "";
      telefono_3 = shPrefs.getString("telefono_3") ?? "";
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "BBDD Local",
      home: Scaffold(
        appBar: AppBar(
          title: Text("Preferencias Compartidasd"),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[


              Text("Base de Datos Local"),
              Text("Persona de Contacto 1:"),
              Text(nombre_1),
              Text(telefono_1),
              ElevatedButton(
                child: Text("Cargar Datos de SP"),
                onPressed: _cargarTelefonos,
              ),
              ElevatedButton(
                child: Text("Guardar Variables SP"),
                onPressed: _guardarTelefonos,
              ),
            ],
          ),
        ),
      ),
    );
  }
}
