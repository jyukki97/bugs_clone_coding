<template>
    <tbody>
        <tr v-for="music in musicList.slice(0, 100)" :key="music.trackId">
            <td>
                <p>{{ music.rank.currentRank }}</p>
            </td>
            <td>
                <img :src="music.album.imageUrl" alt="thumbnail">
            </td>
            <td>
                <div>{{ music.trackTitle }}</div>
                <div>
                    <span v-for="artist in music.artists" :key="artist.artistId">{{ artist.artistName }}</span>
                </div>
            </td>
        </tr>
    </tbody>
</template>

<script>
export default {
    name: 'ChartLayout',
    data () {
        return {
            musicList: []
        }
    },
    mounted () {
        this.getMusicList();
    },
    methods: {
        getMusicList () {
            this.axios.get('/bugs/v1.0/music')
                .then((response) => {
                    this.musicList = this.$_.get(response, "data.response.result.chart.items.tracks");
                    console.log(this.musicList);
                    console.log(response)
                })
                .catch((response) => {
                    this.musicList = [];
                    console.log(response);
                })

        }
    }
}
</script>
