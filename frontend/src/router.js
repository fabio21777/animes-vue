import Forum from "./pages/Forum.vue"
import Catalogo from "./pages/Catalogo.vue"
import Resumo from "./pages/Resumo.vue"
export const routes = [
    {path : '/', component : Catalogo, name : 'catalogo'},
    {path : '/forum', component : Forum, name : 'forum'},
    {path : '/resumo/:id', component : Resumo, name : 'resumo'},
]
