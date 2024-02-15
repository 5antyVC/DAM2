import 'package:ejercicio2/segundaPagina.dart';
import 'package:flutter/material.dart';



class HomePage extends StatelessWidget {
  const HomePage({super.key});


  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Ejercicio',
      home: Scaffold(
        appBar: AppBar(
          actions: const [Icon(Icons.menu)],
          backgroundColor: Colors.blue,
          foregroundColor: Colors.white,
        ),
        body: SingleChildScrollView(
          child: Center(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.start,
              children: [
                Row(
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: [
                    SizedBox(
                      height: 100,
                      width: 100,
                      child: Image.asset("assets/azul.png"),
                    ),
                    const SizedBox(width: 10),
                    const Column(children: [
                      Text(
                        "Nombre",
                        style: TextStyle(fontSize: 30),
                      ),
                      Text("Apellido"),
                    ]),
                  ],
                ),
                const SizedBox(
                  height: 30,
                ),
                const Row(
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: [
                    Padding(padding: EdgeInsets.symmetric(horizontal: 10)),
                    Text(
                      "Biografia",
                      style: TextStyle(fontSize: 30),
                    ),
                  ],
                ),
                const Row(
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: [
                    Padding(padding: EdgeInsets.symmetric(horizontal: 10)),
                    Flexible(
                      child: Text(
                        "Lorem Ipsum is simply dummy text of the"
                        " printing and typesetting industry.",
                        style: TextStyle(fontSize: 20),
                      ),
                    )
                  ],
                ),
                const SizedBox(
                  height: 30,
                ),
                const Row(
                  mainAxisAlignment: MainAxisAlignment.start,
                  children: [
                    Padding(padding: EdgeInsets.symmetric(horizontal: 10)),
                    Text(
                      "Estudios",
                      style: TextStyle(fontSize: 30),
                    ),
                  ],
                ),
                ListView(
                  shrinkWrap: true,
                  children: const <Widget>[
                    ListTile(
                      leading: CircleAvatar(
                        radius: 5,
                        backgroundColor: Colors.blue,
                      ),
                      title: Text("Matematicas"),
                    ),
                    ListTile(
                      leading: CircleAvatar(
                        radius: 5,
                        backgroundColor: Colors.blue,
                      ),
                      title: Text("CIencias"),
                    ),
                    ListTile(
                      leading: CircleAvatar(
                        radius: 5,
                        backgroundColor: Colors.blue,
                      ),
                      title: Text("Sociales"),
                    ),
                  ],
                ),
                const SizedBox(
                  height: 30,
                ),
                Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    ElevatedButton(
                      onPressed: () {
                        // Acción del botón
                        Navigator.push(context, MaterialPageRoute(builder: (context) => const SegundaPagina()));
                      },
                      style: ElevatedButton.styleFrom(primary: Colors.blue),
                      child: const Text("SALIR",
                          style: TextStyle(color: Colors.white)),
                    ),
                  ],
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}





