<template>
  <div>
    <header class="p-3 bg-dark text-white">
      <div class="container">
        <FrameHeader />
      </div>
    </header>
    <router-view></router-view>
  </div>
</template>

<script>
import FrameHeader from "./components/frame/FrameHeader";

export default {
  name: 'App',
  components: {
    FrameHeader
  }
}
</script>

<style>
@import '~bootstrap/dist/css/bootstrap.css';

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /*margin-top: 60px;*/
}
</style>
