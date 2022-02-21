
import axios from "axios";

export default  class AnimeService{
    constructor(){
        this.http = "https://kitsu.io/api/edge";
    }

    getAnimes(params){
      params = params || {};
      params.page = params.page || 0;
      params.limit = params.limit || 20;
      return axios.get(`${this.http}/anime?page[limit]=${params.limit}&page[offset]=${params.page}`)
    }

}
