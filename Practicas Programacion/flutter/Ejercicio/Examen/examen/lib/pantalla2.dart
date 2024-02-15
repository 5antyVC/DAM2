import 'package:flutter/material.dart';

class pantalla2 extends StatelessWidget {
  const pantalla2({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return  MaterialApp(
      home: Scaffold(
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
               ElevatedButton(onPressed: ()
              {
                Navigator.pushNamed(context, '/pantalla1');
              } ,
              child: Text('Primera'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
