import 'bootstrap-vue/dist/bootstrap-vue.css'
import 'bootstrap/dist/css/bootstrap.css'
import {
  BootstrapVue
} from 'bootstrap-vue'
import VueRouter from 'vue-router'
import Vue from 'vue'
import App from './App.vue'
import {
  routes
} from './router'
Vue.use(BootstrapVue)
Vue.use(VueRouter)

let router = new VueRouter({
  routes,
  mode: 'history'
})

new Vue({
  el: '#app',
  render: h => h(App),
  router
  
})
