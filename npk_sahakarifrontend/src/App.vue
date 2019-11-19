<template>
  <div id="app">
    <Navbar />
    <div class="container">
      <router-view />
    </div>
  </div>
</template>

<script>
import Navbar from './views/Navbar';
export default {
  components:{
      Navbar
  }
};
</script>

