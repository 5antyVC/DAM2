import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';
import 'package:galeria/post.dart';

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
      home: const MyHomePage(title: 'Mi galería'),
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
  static Future<List<Post>> getLibreria() async {
    var url =
        Uri.parse("https://jsonplaceholder.typicode.com/albums/1/photos");
    final response = await http.get(url, headers: {"Content-type": "application/json"});
    final List body = json.decode(response.body);

    return body.map((e) => Post.fromJson(e)).toList();
  }

  Future<List<Post>> migaleria = getLibreria();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        title: Text(widget.title),
      ),
      body: Center(
        child: FutureBuilder<List<Post>>(
          future: migaleria,
          builder: (context, snapshot){
            if(snapshot.connectionState == ConnectionState.waiting){
              return const CircularProgressIndicator();
            }else if(snapshot.hasData){
              final fotos = snapshot.data;
              return mostrarFotos(fotos!);
            }else{
              return const Text("Sin imagenes.");
            }
          },
        ),
      )
    );
  }


  Widget mostrarFotos(List<Post> fotos) {
    return ListView.builder(
      itemCount: fotos.length,
      itemBuilder: (context, index){
        final post = fotos[index];
        return Container(
          width: 100,
          child: Row(
            children: [
              Expanded(flex: 1, child: Image.network(post.miniatura!))
            ],
          ),
        );
      }
    );
  }

}
