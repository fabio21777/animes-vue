<template>
  <div class="body">
    <div class="row checkes">
      <div class="col-1">
        <label for="filmes"> <strong>FILMES</strong></label>
        <input id="filmes" class="checkbox" type="checkbox" />
      </div>
      <div class="col-1">
        <label for="series"> <strong>SERIES</strong> </label>
        <input
          class="checkbox"
          id="series"
          type="checkbox"
          value="true"
          checked
        />
      </div>
    </div>
    <div class="container-fluid">
      <h4 class="titulo-anime">ANIME</h4>
    </div>
  </div>
</template>

<script>
export default {
  name: "Catalogo",

  components: {},

  data() {
    return {};
  }
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
</style>
