<template>
  <div>
      <div class="destaque"> 
          <h1 class="text-destaque" Fórum </h1>
      </div>
    
    <div class="forum-header"  v-for="post in data" :key="post.id">
        <h2 class="text"  >{{ post.title }}</h2>
        <div class="post-content">
            <p class="text">{{ post.descricao }}</p>
        </div>
    </div>
  </div>
</template>
<script>
import ForumSevice from "../services/ForumService";
export default {
  data() {
    return {
      data: [],
      service: new ForumSevice(),
    };
  },
  created() {
    this.service.getPosts().then((response) => {
      this.data = response.data;
    });
  },
};
</script>
<style lang="">
.destaque {
  font-size: 2em;
  font-weight: bold;
  text-align: center;
  margin: 0.5em;
}

.text-destaque {
    text-align: left;
  font-size: 1.5em;
}
.forum-header,
.posts-header {
  background-color: #292929;
  display: block;
  text-align: left;
  color: #fff;
}
.post-content{
    background-color: #fff;
    display: block;
    text-align: left;
    color: #000;
}
.text{
  text-align: left;
  font-size: 1.5em;
  padding: 0.5em;
}
</style>