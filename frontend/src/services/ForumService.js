import axios from "axios";

export default class ForumService {
    constructor() {
        this.url = "http://localhost:8181";
    }
    getPosts(){
        return axios.get(`${this.url}/post`);
    }
}