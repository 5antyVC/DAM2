import 'package:flutter/material.dart';

class pantalla1 extends StatelessWidget {
  const pantalla1({Key? key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          actions: [Icon(Icons.menu)],
          backgroundColor: Colors.red,
          foregroundColor: Colors.white,
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.start,
            children: [
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  SizedBox(
                    width: 10,
                  ),
                  //Image.asset('assets/hola.png'),
                  Icon(Icons.monitor, size: 100),
                  Text(
                    'data',
                    style: TextStyle(fontSize: 40),
                  ),
                ],
              ),
              SizedBox(
                height: 40,
              ),
              Column(
                children: [
                  Row(
                    mainAxisAlignment: MainAxisAlignment.center,
                    children: [
                      Text(
                        'Descripción',
                        style: TextStyle(fontSize: 40),
                      ),
                    ],
                  ),
                  Text('aaaaaaaaaaaaaaaaaaaa\n'),
                ],
              ),
              SizedBox(
                height: 40,
              ),
              Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text(
                    'Otra Descripción',
                    style: TextStyle(fontSize: 40),
                  ),
                ],
              ),
              Center(
                child: Column(
                  children: [
                    ListView(
                      shrinkWrap: true,
                      children: [
                        ListTile(
                          title: Text('Hola'),
                        ),
                        ListTile(
                          title: Text('Hola'),
                        ),
                        ListTile(
                          title: Text('Hola'),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
              SizedBox(
                height: 40,
              ),
              ElevatedButton(onPressed: ()
              {
                Navigator.pushNamed(context, '/pantalla2');
              } ,
              child: Text('Segunda'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
