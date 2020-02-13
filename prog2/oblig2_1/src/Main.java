import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        System.out.println("\n------------------------------- Oblig 2 ----------------------------------------------------------");


        ArrayList<Planet> planetListe = new ArrayList<>(); // Dette blir arrayListen til planetene. Den er dynamisk på størrelse.

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
//-------------------------Legger planetene inn i en arrayList--------------------------
//------------ Må bruke .add for å legge inn planetene over inn i arrayListen ----------
        planetListe.add(mercury);
        planetListe.add(venus);
        planetListe.add(earth);
        planetListe.add(mars);
        planetListe.add(jupiter);
        planetListe.add(saturn);
        planetListe.add(uranus);
        planetListe.add(neptune);
//-----------------For loops--------------------------------------------------
//------ Lager tomme variabler som blir endret innhold av for loopen under. --
        String planetNames = "";

        String planetRadiusLargestName = ""; // Navnet til den
        double planetRadiusLargest = 0;     //                                                          -----


        String planetRadiusSmallestName = "";
        double planetRadiusSmallest = 1E90;

        String planetMassLargestName = "";
        double planetMassLargest = 0;

        String planetMassSmallestName = "";
        double planetMassSmallest = 1E90;

        // Laget en loop som jeg bruker til flere enn en oppgave.
        // Legger infoen i tomme strings og double over. Siden jeg valgte
        //å gjøre oppgavene på slik måte.
        for(Planet planets : planetListe){
            planetNames += planets.getName();
            planetNames += ","; // Vet ikke om en annen måte å sette inn et komma mellom hvert ord i en loop enda.
                                //Er sikkert en annen måte jeg kommer til å lære senere.
                                // Gjorde oppgaven på tungvint metode, men trur resultatet ble greit.

            if(planetRadiusLargest < planets.getRadius()){
                planetRadiusLargest = planets.getRadius();
                planetRadiusLargestName = planets.getName();
            }

            if(planetRadiusSmallest > planets.getRadius()){
                planetRadiusSmallest = planets.getRadius();
                planetRadiusSmallestName = planets.getName();
            }

            if(planetMassLargest < planets.getMass()){
                planetMassLargest = planets.getMass();
                planetMassLargestName = planets.getName();
            }

            if(planetMassSmallest > planets.getMass()){
                planetMassSmallest = planets.getMass();
                planetMassSmallestName = planets.getName();
            }
                // har if statments for at den skal bytte ut hva som står i string/double over.
                // Og bruker den informasjonen jeg får til oppgaver under.
        }

//----------------------------------------------------------------------
        System.out.println("\n------------------------------Oppgave 2.2---------------------------------------------------------");

       PlanetSystem solarSystem = new PlanetSystem("Solar System", null,null); // Setter null på centerStar og planets siden jeg har lyst at den skal være dynamisk.
       solarSystem.setCenterStar(sun.getName()); // Legger til sol navnet.
       solarSystem.setPlanets(planetNames.substring(0, planetNames.length() - 1)); // for å fjerne den siste komma som kommer i for loopen. .substring(0, planetNames.length() - 1)

        System.out.println(solarSystem); // Printer ut ferdig resultatet etter alt over.


        System.out.println("\n-------------------------------Oppgave 2.3--------------------------------------------------------");

        System.out.println(earth);
        System.out.println(sun);

        // Hvordan oppgaven ser ut etter at @Override har blitt lagt til i de andre filene.

        System.out.println("\n------------------------------Oppgave 2.4---------------------------------------------------------");

        System.out.println(String.format("Planeten %s har en masse på %f Mjup og en radius på %f Rjup", saturn.getName(),saturn.mJ(),saturn.rJ()));
        System.out.println(String.format("Stjernen %s har en masse på %f Msun og en radius på %f Rsun.",sun.getName(),sun.mS(),sun.rS()));

        System.out.println("\n-----------------------------Oppgave 2.5---------------------------------------------------------");

        System.out.println(String.format("%f er overflatens gravitasjon på %s",neptune.surfaceGravity(),neptune.getName()));

        System.out.println("\n-----------------------------Oppgave 2.6----------------------------------------------------------");

        System.out.println(String.format("%s er den storste planeten med radius på %.2f km. %s har en masse på %.2f kg.", planetRadiusLargestName,planetRadiusLargest, planetMassLargestName, planetMassLargest));
        System.out.println(String.format("%s er den minste planeten med en radius på %.2f km. %s har en masse på %.2f kg.", planetRadiusSmallestName,planetRadiusSmallest,planetMassSmallestName,planetMassSmallest));
        // Tenker dette er en måte å vise svaret på. Ville ikke hardkode for mye. Gjøre oppgaven litt dynamisk.

        System.out.println("\n-----------------------------Oppgave 3.1----------------------------------------------------------");

        System.out.println(String.format("Planeten %s har en masse på %.2f Mearth og en radius på %.2f Rearth.", mars.getName(), mars.mE(),mars.rE()));

        System.out.println("\n---- Kris S Soderkvist ------------------------- THE END ----------------- Dato: 31.01.2020 ---------------");

    }




}
