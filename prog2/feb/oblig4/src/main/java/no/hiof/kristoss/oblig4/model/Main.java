package no.hiof.kristoss.oblig4.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Star theSun = new Star("Sun", 1.98892E30, 695342, 5777);


        PlanetSystem solarSystem = new PlanetSystem("Solar System", theSun);

        // Instansierer og legger planetene direkte til i planetsystemet
        solarSystem.addPlanet(new Planet("Mercury", 3.283E23, 2439.7, 0.387, 0.206, 88, theSun));
        solarSystem.addPlanet(new Planet("Venus", 4.867E24, 6051.8, 0.723, 0.007, 225, theSun));
        solarSystem.addPlanet(new Planet("Earth", 5.972E24, 6371, 1, 0.017, 365, theSun));
        solarSystem.addPlanet(new Planet("Mars", 6.39E23, 3389.5, 1.524, 0.093, 687, theSun));
        solarSystem.addPlanet(new Planet("Jupiter", 1.898E27, 69911, 5.20440, 0.049, 4380, theSun));
        solarSystem.addPlanet(new Planet("Saturn", 5.683E26, 58232, 9.5826, 0.057, 10585, theSun));
        solarSystem.addPlanet(new Planet("Uranus", 8.681E25, 25362, 19.2184, 0.046, 30660, theSun));
        solarSystem.addPlanet(new Planet("Neptune", 1.024E26, 24622, 30.11, 0.010, 60225, theSun));


        // Henter ut en referanse til hver planet
        Planet mercury = solarSystem.getPlanets().get(0);
        Planet venus = solarSystem.getPlanets().get(1);
        Planet earth = solarSystem.getPlanets().get(2);
        Planet mars = solarSystem.getPlanets().get(3);
        Planet jupiter = solarSystem.getPlanets().get(4);
        Planet saturn = solarSystem.getPlanets().get(5);
        Planet uranus = solarSystem.getPlanets().get(5);
        Planet neptune = solarSystem.getPlanets().get(7);




        System.out.println("--------------------Alle planeter -------------------------");
        List<PlanetSystem> galaxy = new ArrayList<>();
        galaxy.add(solarSystem);

        Collections.sort(galaxy);

        System.out.println(galaxy);

        PlanetSystem.printConditionally(galaxy, s -> true);


    }
}
