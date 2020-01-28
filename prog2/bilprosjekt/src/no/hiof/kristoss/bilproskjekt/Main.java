package no.hiof.kristoss.bilproskjekt;

public class Main {

    public static void main(String[] args) {
//	    Product passat = new Product("Volkswagon", "Passat", 2005);
//        System.out.println(passat.getMerke() + " " + passat.getModell() + " er ifra "+ passat.getArsmodell());
//        System.out.println("---------------------------------------------");
//
//        Wheel supra = new Wheel("Toyota", "Super", 1996, 19, 20);
//
//        System.out.println(supra);

        System.out.println("--------------------------------------------");
        Car passat3bg = new Car("Volkswagen", "Passat 3BG",2005, 16, 18, 468, 175, 150);
        Car e30 = new Car("BMW", "E30", 1986, 16, 15, 432, 164,138);


        System.out.println(e30);
        System.out.println("--------------------------------------------------");
        System.out.println(passat3bg);
    }
}
