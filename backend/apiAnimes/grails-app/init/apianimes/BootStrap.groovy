package apianimes

class BootStrap {
  PostService postService
  AutorService autorService
  CommentService commentService

  def init = { servletContext ->
    Autor autor = new Autor(nome: "fabricio",sobreNome: "souza")
    autorService.save(autor).save()
    Autor autorComments = new Autor(nome: "fabio",sobreNome: "souza")
    autorService.save(autor).save()
    Post post = new Post(title:"grails, venha apreender",descricao: "discursões focada em compartilhar o conhecimento em grail, e fementando a comunidade",autor:autor)
    postService.save(post).save()
    Comment comment = new Comment(comment: "um otimo projeto de anime",autor:autorComments,post:post)
    commentService.save(comment).save()
  }
  def destroy = {
  }
}

