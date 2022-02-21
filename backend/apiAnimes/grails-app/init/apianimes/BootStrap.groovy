package apianimes

class BootStrap {
    PostService postService
    def init = { servletContext ->
      Post post = new Post(title:"The Stand")
      postService.save(post).save()
    }
    def destroy = {
    }
}
