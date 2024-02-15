import 'package:flutter/material.dart';
import 'package:pasepantalla/PrimeraPantalla.dart';
import 'package:pasepantalla/SegundaPantalla.dart';

void main() {
  runApp(MaterialApp(
    initialRoute: '/primeraPantalla',
    routes: {
      '/primeraPantalla': (context) => PrimeraPantalla(),
      '/segundaPantalla': (context) => SegundaPantalla(),
    },
  )); 
}
