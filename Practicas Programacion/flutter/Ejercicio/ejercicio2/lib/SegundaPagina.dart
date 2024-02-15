import 'package:flutter/material.dart';


class SegundaPagina extends StatelessWidget {
  const SegundaPagina({Key? key}) : super(key: key);


  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('SegundaPagina'),
      ),
      body: const Center(
        child: Text('SOY SEGUNDA PAGINA'),
      ),
    );
  }
}

