package apianimes

class Post {
  String title
  String body
    static belongsTo = [autor:Autor]
    static hasMany = [comments:Comment]
    static constraints = {
      title nullable:false, maxSize:256
      body nullable:true
      autor nullable: true
      comments nullable: true
    }

  @Override
  String toString() {
    return id
  }
}
