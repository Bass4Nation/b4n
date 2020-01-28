package no.hiof.kristoss;

public class Fly {

    private String modell;
    private int passasjerer, seter;

    public Fly(String modell, int seter) {
        this.modell = modell;
        this.seter = seter;
    }
    public void leggTilEnPassasjer() {
        if (passasjerer < seter) {
            passasjerer++;
        }
        else
            System.out.println("Det er ikke flere seter på flyet " + modell);
    }

    public String getModell() {
        return modell;
    }

    public int getPassasjerer() {
        return passasjerer;
    }

    public int getSeter() {
        return seter;
    }

    @Override
    public String toString(){
        return modell + " har " + seter + " seter.";
    }
}