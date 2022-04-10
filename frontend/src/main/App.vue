<template>
    <div id="app">
        <MenuList></MenuList>
        <div class="w-100" style="flex: 1">
            <router-view></router-view>
        </div>
    </div>
</template>

<script>

import MenuList from "@/main/components/MenuList";
export default {
    name: 'App',
    components: { MenuList }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  width: 100%;
  height: 100%;
  display: flex;
  flex-direction: row;
}
</style>
