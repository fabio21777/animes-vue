<template>
  <div id="app">
    <Nav-bar></Nav-bar>
    <Catalogo></Catalogo>
  </div>
</template>

<script>
import NavBar from "./components/NavBar.vue";
import Catalogo from "./pages/Catalogo.vue";
export default {
  name: "app",

  components: {
    "Nav-bar": NavBar,
    Catalogo: Catalogo
  },

  data() {
    return {};
  }
};
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;1,100;1,200&family=Open+Sans:ital,wght@0,700;1,300&display=swap');
#app{
  font-family: 'Montserrat', sans-serif;
  
}

</style>
