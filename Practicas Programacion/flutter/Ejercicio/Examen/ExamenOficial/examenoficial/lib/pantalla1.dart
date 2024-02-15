import 'package:examenoficial/pantalla2.dart';
import 'package:flutter/material.dart';

class pantalla1 extends StatelessWidget {
  const pantalla1({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          actions: [Icon(Icons.menu)],
          title: Text('Marcas de Vehiculos'),
          backgroundColor: Colors.blue,
          foregroundColor: Colors.white,
        ),
        body: Center(
          child: Column(
            children: [
              const Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text(
                    'Eléctricos',
                    style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
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
                          onTap: () {
                            Navigator.pushNamed(context, '/pantalla2');
                          },
                          leading: Icon(Icons.car_rental),
                          title: Text('Tesla'),
                          subtitle: Text('EE.UU.'),
                          trailing: Icon(Icons.navigate_next),
                        ),
                        ListTile(
                          onTap: () {
                            Navigator.pushNamed(context, '/pantalla2');
                          },
                          leading: Icon(Icons.car_rental),
                          title: Text('Renault'),
                          subtitle: Text('FRANCE'),
                          trailing: Icon(Icons.navigate_next),
                        ),
                        ListTile(
                          onTap: () {
                            Navigator.pushNamed(context, '/pantalla2');
                          },
                          leading: Icon(Icons.car_rental),
                          title: Text('Toyota'),
                          subtitle: Text('JAPON'),
                          trailing: Icon(Icons.navigate_next),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
              const Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  Text(
                    'No Eléctricos',
                    style: TextStyle(
                      fontSize: 30,
                      fontWeight: FontWeight.bold,
                    ),
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
                          onTap: () {
                            Navigator.pushNamed(context, '/pantalla2');
                          },
                          leading: Icon(Icons.car_crash),
                          title: Text('Seat'),
                          subtitle: Text('Substittle goes here....'),
                          trailing: Icon(Icons.navigate_next),

                        ),
                        ListTile(
                          onTap: () {
                            Navigator.pushNamed(context, '/pantalla2');
                          },
                          leading: Icon(Icons.car_crash),
                          title: Text('Ferrari'),
                          subtitle: Text('Substittle goes here....'),
                          trailing: Icon(Icons.navigate_next),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
