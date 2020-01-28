public class Main {

    public static void main(String[] args) {

        //----------------Star Objects------------------------------
        Star sun = new Star("Sun",695342,1.9885E30,5777);

        //-----------------Planet Objects-----------------------------
        Planet mercury = new Planet("Mercury", 3.283E23,2439.7);
        Planet venus = new Planet("Venus",4.867E24,6051.8);
        Planet earth = new Planet("Earth",5.972E24,6371);
        Planet mars = new Planet("Mars",6.39E23,3389.5);
        Planet jupiter = new Planet("Jupiter",1.898E27,69911);
        Planet saturn = new Planet("Saturn",5.683E26,58232);
        Planet uranus = new Planet("Uranus",8.681E25,25362);
        Planet neptune = new Planet("Neptune",1.024E26,24622);
        //----------------Print Planet---------------------------------

        System.out.println(sun);



       PlanetSystem solarSystem = new PlanetSystem("Solar System","Sun" , "Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune");

        System.out.println("Planeten " + saturn.getName() + " har en masse på " + saturn.mJ() + " Mjup og en radius på " + saturn.rJ() + " Rjup.");
        System.out.println("Stjernen " + sun.getName() + " har en masse på " + sun.mS() + " Msun og en radius på " + sun.rS() + " Rsun.");
    }
}
