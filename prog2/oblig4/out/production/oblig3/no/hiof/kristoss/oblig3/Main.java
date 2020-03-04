package no.hiof.larseknu.oblig2;

public class Main {

	public static void main(String[] args) {
		Star theSun = new Star("Sun", 695700, 1.98892E30, 5777);

		PlanetSystem solarSystem = new PlanetSystem("Solar System", theSun);

		// Instansierer og legger planetene direkte til i planetsystemet
		solarSystem.addPlanet(new Planet("Mercury", 3.283E23, 2439.7));
		solarSystem.addPlanet(new Planet("Venus", 4.867E24, 6051.8));
		solarSystem.addPlanet(new Planet("Earth", 5.972E24, 6371));
		solarSystem.addPlanet(new Planet("Mars", 6.39E23, 3389.5));
		solarSystem.addPlanet(new Planet("Jupiter", 1.898E27, 71492));
		solarSystem.addPlanet(new Planet("Saturn", 5.683E26, 58232));
		solarSystem.addPlanet(new Planet("Uranus", 8.681E25, 25362));
		solarSystem.addPlanet(new Planet("Neptune", 1.024E26, 24622));

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

		System.out.println("First planet: " + mercury);
		System.out.println("Third planet: " + earth);

		System.out.println(String.format("%s has a Jupiter Mass of %f and a Jupiter Radius of %f", saturn.getName(), saturn.getMassInMjup(), saturn.getRadiusInRjup()));

		System.out.println(String.format("%s has a Solar Mass of %f and a Solar Radius of %f ", theSun.getName(), theSun.getMassInMsun(), theSun.getReadiusInRsun()));

		System.out.println(String.format("%s has a Earth Mass of %f and a Earth Radius of %f ", mars.getName(), mars.getMassInMearth(), mars.getRadiusInRearth()));

		System.out.println("The surface gravity of " + earth.getName() + " is " + earth.getSurfaceGravity());
		System.out.println("The surface gravity of " + neptune.getName() + " is " + neptune.getSurfaceGravity());

		Planet smallestPlanet = solarSystem.getSmallestPlanet();
		Planet largestPlanet = solarSystem.getLargestPlanet();

		System.out.println(smallestPlanet.getName() + " is the smallest planet in the " + solarSystem.getName());
		System.out.println(largestPlanet.getName() + " is the largest planet in the " + solarSystem.getName());
	}

}
