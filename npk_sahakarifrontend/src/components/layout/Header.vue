<template>
    <header class="header">
        <h1>TodoList</h1>
    </header>
</template>

<script lang="ts">
import Vue from 'vue'
export default Vue.extend({
    name: "Header"
})
</script>

<style scoped>
  .header{
      background: #333;
      color: #fff;
      text-align: center;
      padding: 10px;
    }
    .header a{
        color: #fff;
        padding-right: 5px;
    }
</style>