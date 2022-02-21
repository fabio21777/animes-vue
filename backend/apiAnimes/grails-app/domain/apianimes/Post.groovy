package apianimes

import java.time.LocalDateTime

class Post {
  String title
  String descricao
  LocalDateTime created_at
    static belongsTo = [autor:Autor]
    static hasMany = [comments:Comment]
    static constraints = {
      title nullable:false, maxSize:256
      descricao nullable:true
      autor nullable: true
      comments nullable: true
    }

  @Override
  String toString() {
    return id
  }
}
