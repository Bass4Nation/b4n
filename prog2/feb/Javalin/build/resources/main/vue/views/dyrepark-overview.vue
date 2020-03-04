<template id="dyrepark-overview">
    <h1 class="h1"> Her kommer dyr! </h1>
    <ul>
        <li v-for="dyr in dyreliste">
            <h1>{{dyr.id + " - " + dyr.navn}}</h1>
        </li>
    </ul>
</template>

<script>
    Vue.component("dyrepark-overview",
        {template: "#dyrepark-overview",
        data: () => ({
        dyreliste: []
        }),
        complete() {
        const parkNavnParam = this.$javalin.pathParam["dyrepark-id"];

        fetch('/api/dyrepark/${parkNavnParam}')
        .then(res => res.json())
        .then(res => this.dyreliste = res)
        .catch(() => alert("Feil i henting av dyr"))
        }
    })

</script>
<style>
    .h1 {
        background-color: darkslategray;
        color: aqua;
    }
</style>