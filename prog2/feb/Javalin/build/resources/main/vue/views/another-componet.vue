<template id="hello-javalin">
    <head>
        <link rel="stylesheet" type="text/css" href="css/stilark.css">

    </head>
    <body>
    <h1> Hello, Anojther component!</h1>
    </body>
</template>

<script>
    Vue.component("another-component",
        {template: "#hello-javalin"});
</script>
<style>

</style>