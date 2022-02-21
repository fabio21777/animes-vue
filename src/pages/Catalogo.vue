<template>
  <div class="body">
    <div class="row checkes">
      <div class="col-1">
        <label for="filmes"> <strong>FILMES</strong></label>
        <input id="filmes" class="checkbox" type="checkbox" v-model="showFilmes" :value="showFilmes"/>
      </div>
      <div class="col-1">
        <label for="series"> <strong>SERIES</strong> </label>
        <input
          class="checkbox"
          id="series"
          type="checkbox"
          :value="showAnimes"
          v-model="showAnimes"
          checked
        />
      </div>
    </div>
    <div v-show="showAnimes" class="container-fluid">
      <h4 class="titulo-anime">ANIMES</h4>
      <div class="painel">
        <div class="painel-img" v-for="(anime,index) in animes" v-bind:key="index">
          <p class="titulo-anime-img">{{anime.canonicalTitle}}</p>
          <img :src="anime.posterImage.small" alt="">
        </div>
      </div>
      <div class="botton-carregar">
        <button @click="carregarMais" type="button" class="btn btn-animes">Carregar Mais</button>
      </div>

    </div>

    <div v-show="showFilmes" class="container-fluid">
      <h4 class="titulo-filmes">FILMES</h4>
      <div class="painel">
        <div class="painel-img" v-for="(filme,index) in filmes" v-bind:key="index">
          <p class="titulo-filme-img">{{filme.canonicalTitle}}</p>
          <img class="img" :src="filme.posterImage.small" alt="">
        </div>
      </div>
    </div>
    <div>
    </div>
  </div>
</template>

<script>
import AnimesService from '../services/AnimesService.js';
export default {
  name: "Catalogo",

  components: {},



  data() {
    return {
      showFilmes:false,
      showAnimes:true,
      animes:[],
      filmes:[],
      animesService : new AnimesService(),
      data:[],
      params:{
        page:0,
        limit:20,
      }
    };
  },

  created() {
    this.buscarAnimes();
  },

  methods:{
    buscarAnimes(){
      this.animesService.getAnimes(this.params).then(response => {
       response.data.data.forEach(element => {
         if (element.attributes.showType === "movie"){
            this.filmes.push(element.attributes);
            console.log("filmes");
         }
          else{
            this.animes.push(element.attributes);
          }
       });
      });
    }
  },
  carregarMais(){
    this.params.page++;
    this.buscarAnimes();

  },
};
</script>

<style scoped>
.body {
  padding-top: 50px;
  background: f7ffd8;
}
.checkes {
  display: flex;
  justify-content: center;
}
.checkbox[type="checkbox"]:before {
  width: 20px;
  height: 20px;
  background: gray;
}

.titulo-anime {
  background: #ffa500;
  color: #ffff;
  display: inline-block;
}
.titulo-filmes {
  background: #2f00ff;
  color: #ffff;
  display: inline-block;
}
.painel {
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}
.painel-img{
  padding-right: 50px;
  padding-bottom: 40px;
  cursor: pointer;
}
.titulo-anime-img {
  text-align: center;
  background: #ffa500;
  cursor: pointer;
}
.titulo-filme-img{
  text-align: center;
  background: #2f00ff;
  color: white;
  cursor: pointer;
}
.img{
  width: 100%;
  height: 402px;
}
.botton-carregar {
  display: flex;
  justify-content: center;
}
.btn-animes {
  background: #ffa500;
  border: none;
  color: #fff;
  cursor: pointer;
}
</style>
