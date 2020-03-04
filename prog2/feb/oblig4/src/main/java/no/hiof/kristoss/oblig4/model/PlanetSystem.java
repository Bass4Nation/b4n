package no.hiof.kristoss.oblig4.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlanetSystem implements Comparable<PlanetSystem> {

    private String name;
    private Star centerStar;
    //private ArrayList<PlanetSystem> planet = new ArrayList<PlanetSystem>();
    private List<Planet> planets = new ArrayList<Planet>();

    public PlanetSystem(String name, Star centerStar) {
        this.name = name;
        this.centerStar = centerStar;
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public List<Planet> getPlanets() {
        return new ArrayList<>(planets);
    }

    public ArrayList<Planet> getPlaneterIPlanetSystem() {
        return new ArrayList<>(getPlanets());
    }


    public Planet getSmallestPlanet() {
        if (planets.size() == 0)
            return null;

        Planet smallestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() < smallestPlanet.getRadius()) {
                smallestPlanet = currentPlanet;
            } else if (currentPlanet.getRadius() == smallestPlanet.getRadius()) {
                if (currentPlanet.getMass() < smallestPlanet.getMass())
                    smallestPlanet = currentPlanet;
            }
        }

        return smallestPlanet;
    }

    public Planet getLargestPlanet() {
        if (planets.size() == 0)
            return null;

        Planet largestPlanet = planets.get(0);

        for (Planet currentPlanet : planets) {
            if (currentPlanet.getRadius() > largestPlanet.getRadius()) {
                largestPlanet = currentPlanet;
            } else if (currentPlanet.getRadius() == largestPlanet.getRadius()) {
                if (currentPlanet.getMass() > largestPlanet.getMass())
                    largestPlanet = currentPlanet;
            }
        }

        return largestPlanet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }
/*

    //-----------------OBLIG 3 UNDER--------------------------------
    //-----------------Oppgave 2.2 ---------------------------------
    public void getInfo(String name) {
        for (Planet currentPlanet : planets) {

            if (name == currentPlanet.getName()) {
                System.out.println(currentPlanet);
            }
        }
    }

    //--------------------Oppgave 2.5-----------------------------------------
    public void distanceToCentralBody(String name, double degrees) {
        // La inn String name for å ha mulighet å velge hvem planet som skal bli sjekket.

        */
/* r= ( a ( 1 - e^2)/ 1 + e*cos(vinkel))  *//*


        for (Planet currentPlanet : planets) {
            double kmAU = 149597871;
            double au = 1;
            double a = currentPlanet.getSemiMajorAxis();
            double e = currentPlanet.getEccentricity();
            double grader = Math.toRadians(degrees);

            // tenker formelen under ser mer ryddig ut med litt mindre info i den.  Så lagde variabler som denne følger.

            double formel = ((a * (1 - (Math.pow(e, 2))) / (1 + e * Math.cos(grader))));
            double km = formel * (kmAU / au);

            if (name == currentPlanet.getName()) {
                System.out.println(String.format("%s has a distance of %.0f km to %s at %.0f degrees", name, km, centerStar.getName(), degrees));
            }
        }
    }

    //--------------------Oppgave 2.6------------------------------------------
    public void orbitingVelocity(String name, double degrees) {
        // La inn String name for å ha mulighet å velge hvem planet som skal bli sjekket.
        // La også inn degrees istedenfor distance, slik vi ikke trenger å kunne vite det lange tallet i km.
        // Tenker det ser også mer logisk ut.

        //    v = SquareRot(GM/r)

        for (Planet currentPlanet : planets) {
            double kmAU = 149597871;
            double au = 1;
            double a = currentPlanet.getSemiMajorAxis();
            double e = currentPlanet.getEccentricity();
            double grader = Math.toRadians(degrees);


            double formelAvstad = ((a * (1 - (Math.pow(e, 2))) / (1 + e * Math.cos(grader))));
            double km = formelAvstad * (kmAU / au);

//            double g = 9.81; //Gravitational constant. Et tall som ble funnet på nett. Har ikke nokk info for å lage den orginale formelen.
            double g = currentPlanet.getSurfaceGravity(); //Gravitational constant. Et tall som ble funnet på nett. Har ikke nokk info for å lage den orginale formelen.
            double m = centerStar.getMass(); // Bruker massen til Stjernen.
            double r = km * 1000;   // Ganger med 1000 for å få m/s
            double formel = Math.sqrt(g * m) / r; // Svaret blir i m/s
            double kms = formel / 1000;  // Omgjøring til km/s

            if (name == currentPlanet.getName()) {

                System.out.println(String.format("At a distance at %.0fkm, %s has a velocity at %.2fkm/s", km, name, kms));

            }

        }

    }
*/

    //----------------------------OBLIG 4 UNDER -------------------------------------

    public static void printConditionally(List<PlanetSystem> planeter, Condition condition) {
        for (PlanetSystem galaxy : planeter) {
            // Gjør en eller annen form for filtrering ved hjelp av condition sin testmetode
            if(condition.test(galaxy)) {
                System.out.println(galaxy.planets);
            }
        }
    }
    public void leggTilEnPlanet(Planet planet) {
        planets.add(planet);
    }





    @Override
    public String toString() {
        return String.format("%s has %d planets that revolve around the star %s", name, planets.size(), centerStar.getName());

    }
/*
    @Override
    public String toString() {
        return String.format("%s has %d planets that revolve around the star %s", name, planets.size(), centerStar.getName());

    }
*/


    @Override
    public int compareTo(PlanetSystem planets) {
        return this.getName().compareToIgnoreCase(planets.getName());
    }


}

interface Condition {
    boolean test(PlanetSystem s);
}



