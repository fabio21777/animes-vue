<template>
  <div id="app">
    <Nav-bar></Nav-bar>
    <router-view></router-view>
  </div>
</template>

<script>
import NavBar from "./components/NavBar.vue";
import Catalogo from "./pages/Catalogo.vue";
export default {
  name: "app",

  components: {
    "Nav-bar": NavBar,
    Catalogo: Catalogo,
  },

  data() {
    return {};
  },
};
</script>

<style>
</style>
