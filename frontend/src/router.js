import Forum from "./pages/Forum.vue"
import Catalogo from "./pages/Catalogo.vue"
export const routes = [
    {path : '/', component : Catalogo, name : 'catalogo'},
    {path : '/forum', component : Forum, name : 'forum'},
]