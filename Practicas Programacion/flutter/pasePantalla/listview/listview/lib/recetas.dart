import 'package:flutter/material.dart';

class Receta {
  final String titulo;
  final String subtitulo;
  final IconData icono;
  final Color color;
  final String imagenUrl;

  const Receta(
      {required this.titulo,
      required this.subtitulo,
      required this.icono,
      required this.color,
      required this.imagenUrl});
}

final recetario = [
  new Receta(
      titulo: 'Paella valenciana',
      subtitulo: '5 horas',
      icono: Icons.food_bank,
      color: Colors.red,
      imagenUrl: 'assets/abiert.png'),
  new Receta(
      titulo: 'Flan de vainilla',
      subtitulo: '3 horas',
      icono: Icons.food_bank,
      color: Color.fromARGB(255, 241, 234, 42),
      imagenUrl: 'assets/abierto.png'),
  new Receta(
      titulo: 'Bocadillo de chorizo',
      subtitulo: '2 minutos',
      icono: Icons.food_bank,
      color: Color.fromARGB(255, 56, 245, 14),
      imagenUrl: 'assets/abierto.png'),
  new Receta(
      titulo: 'Arroz con habichuelas',
      subtitulo: '1 horas',
      icono: Icons.food_bank,
      color: Color.fromARGB(255, 11, 56, 255),
      imagenUrl: 'assets/abierto.png'),
];
