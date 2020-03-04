<template id="hello-world">
    <h1 class="h1"> Hello, world!</h1>
</template>

<script>
    Vue.component("hello-world",
        {template: "#hello-world"});
</script>
<style>
    *{
        background-color: darkslategray;
    }
 .h1 {
    color: aqua;
}
</style>