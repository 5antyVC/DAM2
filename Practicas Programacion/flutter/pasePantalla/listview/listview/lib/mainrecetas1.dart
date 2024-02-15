import 'package:flutter/material.dart';
import 'package:listview/recetas.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: "Flutter Demo",
        theme: new ThemeData(
          colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        ),

        home: Scaffold(
          appBar: AppBar(
            title: Text("Recetas del mundo"),
          ),

          body: Center(
            child: new ListView(
              children: recetario.map(_buildItem).toList(),
            )
          ),
        )
    );
  }
}

Widget _buildItem(Receta receta) {
  return ListTile(
      title: new Text(receta.titulo),
      subtitle: new Text("Tiempo de preparación: " + receta.subtitulo),
      leading: checkFile(receta.imagenUrl,receta.icono),
      
      onTap: () {
        print(receta.titulo);
      }
    );
}

checkFile(String imagen, IconData icono){
  String imagenPorDefecto = "assets/x2.png";
  return Image.asset(imagen,
    errorBuilder: (context, exception, stackTrace) {
      print("No");
      return Image.asset(imagenPorDefecto);
    },
  );
}
