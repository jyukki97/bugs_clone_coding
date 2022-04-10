import { createWebHistory, createRouter } from "vue-router";
import ChartLayout from "@/main/music/chart/ChartLayout";

const routes = [
    {
        path: '/',
        name: 'Index',
        component: ChartLayout
    },
]

export const router = createRouter({
    history: createWebHistory(),
    routes,
});
