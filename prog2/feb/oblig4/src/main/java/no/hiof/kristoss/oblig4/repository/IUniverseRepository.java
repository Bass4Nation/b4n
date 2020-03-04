package no.hiof.kristoss.oblig4.repository;

import java.util.ArrayList;
import no.hiof.kristoss.oblig4.model.Planet;
import no.hiof.kristoss.oblig4.model.PlanetSystem;

public interface IUniverseRepository {

    ArrayList<Planet> getAllePlaneterISolsytemet(String systemName);
    Planet getPlanet(String systemName, String planetName);
    Planet getPlanet(String systemName, int planetId);
    PlanetSystem getPlanetSystem(String systemName);
}
