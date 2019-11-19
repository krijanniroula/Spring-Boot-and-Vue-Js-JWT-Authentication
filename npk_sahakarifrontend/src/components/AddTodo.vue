<template>
    <div>
        <form>
            <input type="text" name="title" placeholder="Add Todo..">
            <input type="submit" value="Submit" class="btn btn-primary">
        </form>
    </div>
</template>

<script lang="ts">
import Vue from 'vue'
export default Vue.extend({
    name: "AddTodo"
})
</script>

<style scoped>
    form{
        display: flex;
    }

    input[type="text"]{
        flex: 10;
        padding: 5px;
    }
    input[type="submit"]{
        flex: 2;
    }
</style>