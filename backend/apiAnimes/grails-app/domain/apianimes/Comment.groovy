package apianimes

class Comment {
    String comment
    static belongsTo = [post:Post,autor:Autor]
    static constraints = {
      comment nullable:false
      post nullable:false
      autor nullable: false
    }

  @Override
  String toString() {
    return id
  }
}
