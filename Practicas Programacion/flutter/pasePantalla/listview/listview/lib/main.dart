import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'package:listview/popeyesrecetas.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Popeye',
      theme: ThemeData(
        colorScheme:
            ColorScheme.fromSeed(seedColor: Color.fromARGB(255, 206, 141, 0)),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Popeye'),
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
  static Future<List<Receta>> getLibreria() async {
    var url = Uri.parse("http://www.popeyeagency.com/recetas/listado.php");
    final response =
        await http.get(url, headers: {"Content-type": "application/json"});
    final List body = json.decode(response.body);

    return body.map((e) => Receta.fromJson(e)).toList();
  }

  Future<List<Receta>> migaleria = getLibreria();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          backgroundColor: Theme.of(context).colorScheme.inversePrimary,
          title: Text(widget.title),
        ),
        body: Center(
          child: FutureBuilder<List<Receta>>(
            future: migaleria,
            builder: (context, snapshot) {
              if (snapshot.connectionState == ConnectionState.waiting) {
                return const CircularProgressIndicator();
              } else if (snapshot.hasData) {
                final fotos = snapshot.data;
                return mostrarFotos(fotos!);
              } else {
                return Text("Sin imagenes");
              }
            },
          ),
        ));
  }

Widget mostrarFotos(List<Receta> fotos) {
  return ListView.builder(
    itemCount: fotos.length,
    itemBuilder: (context, index) {
      final receta = fotos[index];
      return Container(
        width: 100,
        child: Row(
          children: [
            Expanded(
              flex: 1,
              child: receta.imagen != null && receta.imagen!.isNotEmpty
                  ? Image.network(receta.imagen!)
                  : Image.asset("assets/x2.png"),
            ),
          ],
        ),
      );
    },
  );
}
}