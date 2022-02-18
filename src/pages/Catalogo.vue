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

      </div>
    </div>

    <div v-show="showFilmes" class="container-fluid">
      <h4 class="titulo-filmes">FILMES</h4>
    </div>
    <div>
      <div v-for="(anime,index) in animes" v-bind:key="index">
         <p>{{anime.canonicalTitle}}</p>
      </div>

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
      animesService : new AnimesService(),
      data:[],
    };
  },

  created() {
    this.buscarAnimes();
  },

  methods:{
    buscarAnimes(){
      this.animesService.getAnimes().then(response => {
       console.log(response.data.data);
       response.data.data.forEach(element => {
         this.animes.push(element.attributes);
       });
      });
    }
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
</style>
