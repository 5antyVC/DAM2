import 'package:flutter/material.dart';



class pantalla2 extends StatelessWidget {
  const pantalla2({super.key});

  @override
  Widget build(BuildContext context) {
    return  MaterialApp(
      home: Scaffold(
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text('Has clicado en una marca',style: TextStyle(fontSize: 30),),
              SizedBox(height: 40,),
              ElevatedButton(onPressed: (){
              Navigator.pushNamed(context, '/pantalla1');
              },
              child: Text('Atras'),
              ),
            ],
          ),
          
        ),
      ),
    );
  }
}
