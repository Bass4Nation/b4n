package no.hiof.kristoss.oblig3;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Star theSun = new Star("Sun",  1.98892E30,695342, 5777);

        PlanetSystem solarSystem = new PlanetSystem("Solar System", theSun);

        // Instansierer og legger planetene direkte til i planetsystemet
        solarSystem.addPlanet(new Planet("Mercury",  3.283E23,2439.7, 0.387, 0.206, 88 , theSun));
        solarSystem.addPlanet(new Planet("Venus",4.867E24,6051.8, 0.723, 0.007, 225,theSun));
        solarSystem.addPlanet(new Planet("Earth", 5.972E24,6371, 1, 0.017, 365,theSun));
        solarSystem.addPlanet(new Planet("Mars",6.39E23,3389.5, 1.524, 0.093, 687,theSun));
        solarSystem.addPlanet(new Planet("Jupiter",1.898E27,69911, 5.20440, 0.049, 4380,theSun));
        solarSystem.addPlanet(new Planet("Saturn",5.683E26,58232, 9.5826, 0.057, 10585,theSun));
        solarSystem.addPlanet(new Planet("Uranus",8.681E25,25362, 19.2184, 0.046, 30660,theSun));
        solarSystem.addPlanet(new Planet("Neptune",1.024E26,24622, 30.11, 0.010, 60225,theSun));

        System.out.println(solarSystem);

        // Henter ut en referanse til hver planet
        Planet mercury = solarSystem.getPlanets().get(0);
        Planet venus = solarSystem.getPlanets().get(1);
        Planet earth = solarSystem.getPlanets().get(2);
        Planet mars = solarSystem.getPlanets().get(3);
        Planet jupiter = solarSystem.getPlanets().get(4);
        Planet saturn = solarSystem.getPlanets().get(5);
        Planet uranus = solarSystem.getPlanets().get(5);
        Planet neptune = solarSystem.getPlanets().get(7);

//---------------------------- Oppgave 2.2 ------------------------------------------
        System.out.println("---------------------------Oppgave 2.2 ----------------------------------------");

        solarSystem.getInfo("Earth");

        // Kan skrive inn hvem som helst planet som er lagt inn i solarSystem for å få all informasjonen om de.
//---------------------------- Oppgave 2.5 -----------------------------------------
        System.out.println("---------------------------Oppgave 2.5 ----------------------------------------");
        solarSystem.distanceToCentralBody("Earth", 0);
        solarSystem.distanceToCentralBody("Earth", 90);
        solarSystem.distanceToCentralBody("Earth", 180);
        solarSystem.distanceToCentralBody("Earth", 270);
        solarSystem.distanceToCentralBody("Earth", 360);
        //
//-----------------------------------------------------------------------------------
        System.out.println("---------------------------Oppgave 2.6 ----------------------------------------");
        solarSystem.orbitingVelocity("Earth", 0);
        solarSystem.orbitingVelocity("Earth", 45);
        solarSystem.orbitingVelocity("Earth", 90);
        solarSystem.orbitingVelocity("Earth", 135);
        solarSystem.orbitingVelocity("Earth", 180);
        // Valgte å bruke samme metode som i 2.5 at man skriver hvem planet det gjelder (String og case sensitiv) og grader så får man distanse
        //og km/s. Det sto double distance i oppgaven, men tenker dette er mer logisk når man leste videre på oppgaven så ser det ut som
        // den vil heller ha grader.


        System.out.println("---------------------------THE END -------------Kristoffer S Søderkvist---------");

    }
}
