class Post {
  int? albumId;
  int? id;
  String? titulo;
  String? url;
  String? miniatura;

  Post({
    this.albumId, 
    this.id, 
    this.titulo, 
    this.url, 
    this.miniatura}
  );


  Post.fromJson(Map<String, dynamic> json) {
    albumId = json['albumId'];
    id = json['id'];
    titulo = json['title'];
    url = json['url'];
    miniatura = json['thumbnailUrl'];
  }


}
