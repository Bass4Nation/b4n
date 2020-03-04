package no.hiof.larseknu.javalin;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;
import io.javalin.plugin.rendering.vue.VueComponent;
import no.hiof.larseknu.javalin.model.Dyr;
import no.hiof.larseknu.javalin.model.Sjimpanse;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
            Javalin app = Javalin.create().start();

            app.config.enableWebjars();

            // Views
            app.get("/", new VueComponent("hello-world"));
            app.get("/dyrepark/:dyrepark-id", new VueComponent("dyrepark-detail"));

            // API
            app.get("api/dyrepark/:dyrepark-id", new Handler() {
                @Override
                public void handle(Context ctx) throws Exception {
                    ArrayList<Dyr> dyreListe =new ArrayList<Dyr>();
                    dyreListe.add(new Sjimpanse("Julius", 90));

                    ctx.json(dyreListe);
                }
            });


        }


}
