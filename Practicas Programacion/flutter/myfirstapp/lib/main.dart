import 'package:flutter/material.dart';
import 'package:english_words/english_words.dart';

void main() => runApp(Myapp());

class Myapp extends StatelessWidget {
  @override


  Widget build(BuildContext context) {

    final wordPair = WordPair.random();
 

    return MaterialApp(
      title: 'TITULAR',
      home: Scaffold(
        appBar: AppBar(
          title: Text('Mi App'),
        ),
        body: Row(
          children:<Widget>[
            Container(
              color:Colors.blue,
              height: 100,
              width: 102.75,
              ),
              Container(
              color:const Color.fromARGB(255, 243, 33, 33),
              height: 100,
              width: 102.75,
              ),
              Container(
              color:Color.fromARGB(255, 243, 243, 33),
              height: 100,
              width: 102.75,
              alignment: Alignment.center,
              child: Expanded(child:Text("data")
              ),
              ),
              Container(
              color:Colors.blue,
              height: 100,
              width: 102.75,
              
              ),
              
          ]
        ),
      ),
    );
  }
}


