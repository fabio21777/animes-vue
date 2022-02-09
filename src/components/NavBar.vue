<template>
  <div class="body row">
    <img
      class="col-1"
      width="100%"
      height="100%"
      src="/src/assets/imagens/logo.png"
      alt=""
    />
    <b-nav class="col-5">
      <div class="nav-mynav">
        <b-nav-item class="item"> Canais </b-nav-item>
        <b-nav-item class="item">Animes</b-nav-item>
        <b-nav-item class="item">Favoritos</b-nav-item>
        <b-nav-item class="item">Noticias</b-nav-item>
      </div>
    </b-nav>
    <div class="nav-busca col-5">
      <input class="input-buscar" type="text" placeholder="Buscar animes" />
      <button class="button-search">
        <svg
          xmlns="http://www.w3.org/2000/svg"
          width="38"
          height="38"
          fill="currentColor"
          class="bi bi-search icon-busca"
          viewBox="0 0 16 16"
        >
          <path
            d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"
          />
        </svg>
      </button>
    </div>
    <div class="col-1">
      <img
        class="foto"
        width="100%"
        height="100%"
        src="https://i0.wp.com/gamelogia.com.br/wp-content/uploads/2018/02/anime-18.jpg?resize=1280%2C640&ssl=1"
        alt=""
      />
    </div>
  </div>
</template>

<script>
export default {
  name: "NavBar",
  data() {
    return {};
  }
};
</script>

<style scoped>

.nav-mynav {
  display: flex;
  justify-content: space-around;
  align-items: center;
  list-style: none;

}
.item {
  border-radius: 50%;
  font-weight: bold;

}
.item :hover {
  background: #ffbb00c7;
  border-radius: 50%;
  transition: 0ms;
}
.nav-busca {
  display: flex;
  justify-content: flex-end;
  align-items: center;
}
.nav-link {
  color: #fff;
  text-decoration: none;
}

.button-search {
  background: #ffa500;
  border: none;
  color: #fff;
  border-radius: 30%;
  cursor: pointer;
}

.button-search:hover {
  background: #ffbb00c7;
  border: none;
}

.icon-busca {
  color: #fff;
  padding-top: 10px;
}
.nav {
  display: flex;
  justify-content: space-around;
}
.body {
  background: #ffa500;
}
.input-group-tex {
  border: none;
  border-radius: 50px;
  padding: 10px;
  box-shadow: none;
  background: #fff;
}

.input-buscar {
  border: none;
  font-family: Helvetica, sans-serif;
  border-radius: 50px;
  box-shadow: none;
  background: #fff;
}
.input-buscar :focus,
input:focus {
  box-shadow: 0 0 0 0;
  outline: 0;
  border: none;
  font-family: Helvetica, sans-serif;
  border-radius: 50px;

  box-shadow: none;
  background: #fff;
}
.foto {
  border-radius: 50%;
}
.nav-link {
  transition: none;
}
</style>
