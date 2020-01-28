package no.hiof.kristoss.figur.eksempel1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rektangel erRektangel = new Rektangel(5,7);

        System.out.println("Rektangelet har 0: "+ erRektangel.omkrets() + " og A: "+ erRektangel.areal());

        System.out.println("--------------------------------------------------");

        Sirkel enSirkel = new Sirkel(10);

        System.out.println( "Sirkel areal = "+ enSirkel.areal());

        System.out.println("--------------------------------------------------");

        Kvadrat etKvadrat = new Kvadrat(5);

        System.out.println("Kvadratet har Omkrets: " + etKvadrat.omkrets() + " og Areal: " + etKvadrat.areal());

        System.out.println("--------------------------------------------------");

        if(erStorre(erRektangel, enSirkel)){
            System.out.println("Rektangel er større enn sirkel");
        }else{
            System.out.println("Sirkel er større enn Rektangel");
        }

        if(erStorre(erRektangel, etKvadrat)){
            System.out.println("Rektangel er større enn Kvadrat");
        }else{
            System.out.println("Kvadrat er større enn Rektangel");
        }

        if(erStorre(etKvadrat, enSirkel)){
            System.out.println("Kvadratet er større enn sirkel");
        }else{
            System.out.println("Sirkel er større enn Kvadratet");
        }

    }

    public static boolean erStorre(Figur figur1, Figur figur2){
        return figur1.areal() > figur2.areal();

    }
}
