import 'package:examen/pantalla1.dart';
import 'package:examen/pantalla2.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(const MainApp());
}

class MainApp extends StatelessWidget {
  const MainApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      initialRoute: '/pantalla1',
      routes: {
        '/pantalla1': (context) => pantalla1(),
        '/pantalla2': (context) => pantalla2(),
      },
    );
  }
}
