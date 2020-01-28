package no.hiof.kristoss;

public class Main {

    public static void main(String[] args) {

        Fly boeing737 = new Fly("Boeing-737", 130);

        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();
        boeing737.leggTilEnPassasjer();

        System.out.println(boeing737);


        System.out.println(boeing737.getModell() + " har " + boeing737.getPassasjerer() + " passassjerer og "
                + boeing737.getSeter() + " seter") ;

        Transportfly ar232 = new Transportfly("Ar-232",4 ,10000);

        ar232.leggTilPakke(5,5,5);
        ar232.leggTilPakke(2,2,2);

        ar232.leggTilEnPassasjer();
        ar232.leggTilEnPassasjer();
        ar232.leggTilEnPassasjer();
        ar232.leggTilEnPassasjer();
        ar232.leggTilEnPassasjer();

        System.out.println(ar232.getBruktLast() + " brukt av " + ar232.getMaksLast() + " kubikkmeter");
    }
}
