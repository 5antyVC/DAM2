
class Receta {
  String? id;
  String? categoria;
  String? titulo;
  String? tiempo;
  String? imagen;
  String? miniatura;
  /*List<String>? ingredientes;
  String? procedimiento;*/

  Receta({
    this.id, 
    this.categoria, 
    this.titulo, 
    this.tiempo,
    this.imagen,
    this.miniatura,
    /*this.ingredientes,
    this.procedimiento*/
  });

  Receta.fromJson(Map<String, dynamic> json) {
    id = json['id'];
    categoria = json['categoria'];
    titulo = json['titulo'];
    tiempo = json['tiempo'];
    imagen = json['imagen'];
    miniatura = json['miniatura'];
    /*ingredientes = json['ingredientes'];
    procedimiento = json['procedimiento'];*/
  }
}
