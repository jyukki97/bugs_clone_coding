export default {
    getMusicList() {
        return this.axios.get('/bugs/v1.0/music');
    }
}
