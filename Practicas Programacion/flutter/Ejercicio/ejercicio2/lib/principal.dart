
import 'package:ejercicio2/SegundaPagina.dart';
import 'package:ejercicio2/main.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(principal());
}

class principal extends StatelessWidget{
  const principal({super.key});

  @override
  Widget build(BuildContext context)
  {
    return MaterialApp(
        initialRoute: '/main',
        routes: {
          '/main':(context) => HomePage(),
          '/SegundaPantalla':(context) => const SegundaPagina(),
        },
    );
  }
}


