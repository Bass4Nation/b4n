package no.hiof.kristoss.bilproskjekt;

public class Wheel extends Product {
    private int felg, dekk;

    public Wheel(String merke, String modell, int arsmodell, int felg, int dekk) {
        super(merke, modell, arsmodell);
        this.felg = felg;
        this.dekk = dekk;
    }

    public void checkWheel(int felg, int dekk){
        if( dekk < felg ){
            System.out.println("Dekk passer på felgen.");
        }else{
            System.out.println("Dekket passer ikke på felgen.");
        }

    }


    public int getFelg() {
        return felg;
    }

    public int getDekk() {
        return dekk;
    }
/*
    @Override
    public String toString() {
        return getMerke() + " " + getModell() + " og er fra " + getArsmodell();
    }
*/


}
