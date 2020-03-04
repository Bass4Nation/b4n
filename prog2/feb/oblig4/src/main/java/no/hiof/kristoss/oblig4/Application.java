
package no.hiof.kristoss.oblig4;


import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;

import no.hiof.kristoss.oblig4.controller.PlanetSystemController;
import no.hiof.kristoss.oblig4.repository.UniverseRepository;


public class Application {

    public static void main(String[] args) {
        Javalin app = Javalin.create().start();

        app.config.enableWebjars();

        app.get("/hello-world", new VueComponent("hello-world"));
        app.get("/planet-systems", new VueComponent("planet-system-overview"));
        app.get("/planet-systems-detail", new VueComponent("planet-system-detail"));
        app.get("/planet-detail", new VueComponent("planet-detail"));

        UniverseRepository universeRepository = new UniverseRepository();
        PlanetSystemController planetSystemController = new PlanetSystemController(universeRepository);

       app.get("api/planetSystem/:PlantSystem-id", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                planetSystemController.getAllePlanetSystemer(ctx);
            }
        });

    }
}

