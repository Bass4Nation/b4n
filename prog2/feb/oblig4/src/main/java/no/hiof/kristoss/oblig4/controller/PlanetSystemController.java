package no.hiof.kristoss.oblig4.controller;

import io.javalin.http.Context;
import no.hiof.kristoss.oblig4.model.PlanetSystem;
import no.hiof.kristoss.oblig4.repository.IUniverseRepository;
import no.hiof.kristoss.oblig4.model.Planet;

import java.util.ArrayList;

public class PlanetSystemController {
    private IUniverseRepository universeRepository;

    public PlanetSystemController(IUniverseRepository universeRepository) {
        this.universeRepository = universeRepository;
    }

    public void getAllePlanetSystemer(Context context) {
        String planetSystemId = context.pathParam(":PlanetSystem-id");

        ArrayList<Planet> all = universeRepository.getAllePlaneterISolsytemet(planetSystemId);

        context.json(all);
    }

}
