package no.hiof.kristoss;

public class Transportfly extends Fly {
    private double maksLast, bruktLast;


    public Transportfly(String modell, int seter, double maksLast) {
        super(modell, seter);
        this.maksLast = maksLast;
    }

    public void leggTilPakke(double hoyde, double bredde, double lengde){
        double pakkeVolum = hoyde * bredde * lengde;

        if (harTilgjengeligPlass(pakkeVolum)){
            bruktLast += pakkeVolum;
        }
        else {
            System.out.println("Det er ikke mer plass på flyet");
        }
    }

    private boolean harTilgjengeligPlass(double pakkeVolum) {
        return (bruktLast + pakkeVolum) < maksLast;
    }

    public double getMaksLast() {
        return maksLast;
    }

    public double getBruktLast() {
        return bruktLast;
    }
}
