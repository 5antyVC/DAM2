import 'package:flutter/material.dart';

class PrimeraPantalla extends StatefulWidget{
  @override

  _PrimeraPantalla createState() => _PrimeraPantalla();
}

class _PrimeraPantalla extends State<PrimeraPantalla> {
  @override

  Widget build(BuildContext context){
    return Scaffold(
      appBar: AppBar(
        title: const Text("Primera pantalla"),
      ),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.center,
        children: <Widget>[
          const Text("Esta es la pantalla 1.", style: TextStyle(fontSize: 32, fontWeight: FontWeight.bold, color: Colors.lime),),
          const SizedBox(height: 10),
          Center(
            child: ElevatedButton(
              onPressed: (){
                Navigator.pushNamed(context, '/segundaPantalla');
              },
              child: const Text( "Ir a pantalla 2", style: TextStyle(fontSize: 20, fontWeight: FontWeight.normal))
            )
          )

        ],
      ),
    );
  }
}