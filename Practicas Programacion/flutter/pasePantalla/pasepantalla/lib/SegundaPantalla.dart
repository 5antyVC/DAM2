import 'package:flutter/material.dart';

class SegundaPantalla extends StatefulWidget {
  @override
  _SegundaPantallaState createState() => _SegundaPantallaState();
}

class _SegundaPantallaState extends State<SegundaPantalla> {
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          "Segunda pantalla",
          style: TextStyle(fontWeight: FontWeight.bold),
        ),
      ),
      body: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            const Text(
              "Esta es la pantalla 2.",
              style: TextStyle(
                  fontSize: 32,
                  fontWeight: FontWeight.bold,
                  color: Color.fromARGB(255, 224, 49, 13)),
            ),
            const SizedBox(height: 10),
            Center(
                child: ElevatedButton(
                    onPressed: () {
                      Navigator.pushNamed(context, '/primeraPantalla');
                    },
                    child: const Text("Ir a pantalla 1",
                        style: TextStyle(
                            fontSize: 20, fontWeight: FontWeight.normal)))),
          ]),
    );
  }
}
