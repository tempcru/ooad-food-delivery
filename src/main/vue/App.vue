<template>
  <div> 
    <web-header/>
    <router-view class="frame-body"></router-view> 
    <web-footer/>
  </div>
</template>

<script> 
import WebHeader from "./components/WebHeader.vue"; 
import WebFooter from './components/WebFooter.vue';

export default {
  name: 'App',
  components: {
    WebHeader,
    WebFooter
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}

.frame-body {
  padding-top: 60px; 
}
</style>
