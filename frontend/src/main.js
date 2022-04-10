import { createApp } from 'vue'
import App from './main/App.vue'
import axios from "axios";
import _ from "lodash";
import { router } from "@/main/common/VueRouterConfig";

axios.defaults.baseURL = 'http://localhost:8080';
axios.defaults.timeout = 60000;

const app = createApp(App);
app.config.globalProperties.axios = axios;
app.config.globalProperties.$_ = _;

app.use(router).mount('#app');
