package no.hiof.kristoss.oblig4.repository;

import java.util.ArrayList;

import no.hiof.kristoss.oblig4.model.*;

public class UniverseRepository implements IUniverseRepository {
    public ArrayList<PlanetSystem> planetSystemer = new ArrayList<>();


    public UniverseRepository() {

//---------------------------------------------------------------------Stjerner----------------------------------------------------------------------------------
        //name,mass,radius,effectiveTemp,pictureUrl
        Star Sun = new Star("Sun", 1.9885E30, 695342, 5777, "https://upload.wikimedia.org/wikipedia/commons/c/c3/Solar_sys8.jpg");
        Star Kepler = new Star("Kepler-11", 1.889E30, 710310, 5680, "https://upload.wikimedia.org/wikipedia/commons/6/64/Kepler11.png");
//-----------------------------------------------------------------------StjerneSystemet-------------------------------------------------------------------------------
        PlanetSystem solarSystem = new PlanetSystem("SolarSystem", Sun);
//-----------------------------------------------------------------------Planeter----------------------------------------------------------------------------


        Planet mercury = new Planet("Mercury", 3.283E23, 2439.7, 0.387, 0.206, 88, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Transit_Of_Mercury%2C_May_9th%2C_2016.png/480px-Transit_Of_Mercury%2C_May_9th%2C_2016.png");
        Planet venus = new Planet("Venus", 4.867E24, 6051.8, 0.723, 0.007, 225, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/SDO%27s_Ultra-high_Definition_View_of_2012_Venus_Transit_%28304_Angstrom_Full_Disc_02%29.jpg/480px-SDO%27s_Ultra-high_Definition_View_of_2012_Venus_Transit_%28304_Angstrom_Full_Disc_02%29.jpg");
        Planet earth = new Planet("Earth", 5.972E24, 6371, 1, 0.017, 365, "https://upload.wikimedia.org/wikipedia/commons/thumb/a/aa/NASA_Earth_America_2002.jpg/480px-NASA_Earth_America_2002.jpg");
        Planet mars = new Planet("Mars", 6.39E23, 3389.5, 1.524, 0.093, 687, "https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Mars_23_aug_2003_hubble.jpg/480px-Mars_23_aug_2003_hubble.jpg");
        Planet jupiter = new Planet("Jupiter", 1.898E27, 69911, 5.20440, 0.049, 4380, "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2b/Jupiter_and_its_shrunken_Great_Red_Spot.jpg/480px-Jupiter_and_its_shrunken_Great_Red_Spot.jpg");
        Planet saturn = new Planet("Saturn", 5.683E26, 58232, 9.5826, 0.057, 10585, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1c/Saturn_from_Cassini_Orbiter_-_Square_%282004-10-06%29.jpg/480px-Saturn_from_Cassini_Orbiter_-_Square_%282004-10-06%29.jpg");
        Planet uranus = new Planet("Uranus", 8.681E25, 25362, 19.2184, 0.046, 30660, "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Uranus2.jpg/480px-Uranus2.jpg");
        Planet neptune = new Planet("Neptune", 1.024E26, 24622, 30.11, 0.010, 60225, "https://upload.wikimedia.org/wikipedia/commons/thumb/4/41/Neptune_Full_%28cropped%29.jpg/480px-Neptune_Full_%28cropped%29.jpg");


//-----------------------------------------------------------------------(nooooe)----------------------------------------------------------------------------------

/*
    Kepler-11b,2.56796E25,12550,1.36134E7,0.045,10,
    Kepler-11c,8.0622E25,20068,1.5857E7,0.026,13,
    Kepler-11d,3.64292E25,21852,2.3786E7,0.004,22,
    Kepler-11e,5.01648E25,28796,2.9021E7,0.012,31,
    Kepler-11f,1.37356E25,16628,3.7399E7,0.013,36,
    Kepler-11g,1.7916E27,23317,6.9114E7,0.015,118,
*/
//-------------------------------------------------------------------------------------------------------------------------------------------------------------

        solarSystem.leggTilEnPlanet(mercury);
        solarSystem.leggTilEnPlanet(venus);
        solarSystem.leggTilEnPlanet(earth);
        solarSystem.leggTilEnPlanet(mars);
        solarSystem.leggTilEnPlanet(jupiter);
        solarSystem.leggTilEnPlanet(saturn);
        solarSystem.leggTilEnPlanet(uranus);
        solarSystem.leggTilEnPlanet(neptune);


        planetSystemer.add(solarSystem);
    }



    public ArrayList<Planet> getAllePlaneterISolsytemet(String systemName) {
        PlanetSystem thisPlanetSystem = getPlanetSystem(systemName);

        if (thisPlanetSystem != null)
            return thisPlanetSystem.getPlaneterIPlanetSystem();

        return new ArrayList<>();
    }



    public Planet getPlanet(String systemName, String planetName) {
        PlanetSystem aktuellPlanetSystem = getPlanetSystem(systemName);

        if (aktuellPlanetSystem != null) {
            for (Planet enPlanet : aktuellPlanetSystem.getPlaneterIPlanetSystem()) {
                if (enPlanet.getName().equals(systemName))
                    return enPlanet;
            }
        }

        return null;
    }


   public Planet getPlanet(String systemName, int planetId) {
        PlanetSystem aktuellPlanetSystem = getPlanetSystem(systemName);

        if (aktuellPlanetSystem != null) {
            for (Planet enPlanet : aktuellPlanetSystem.getPlaneterIPlanetSystem()) {
                if (enPlanet.getId() == planetId)
                    return enPlanet;
            }
        }

        return null;
    }


    public PlanetSystem getPlanetSystem(String systemName) {
        for (PlanetSystem planetSystem : planetSystemer) {
            if (planetSystem.getName().equals(systemName))
                return planetSystem;
        }

        return null;
    }

}
