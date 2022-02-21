
import axios from "axios";

export default  class AnimeService{
    constructor(){
        this.http = "https://kitsu.io/api/edge";
    }

    getAnimes(params){
      console.log(params.page);
      params = params || {};

      return axios.get(`${this.http}/anime?page[limit]=${params.limit}&page[offset]=${params.page}`)
    }

}
