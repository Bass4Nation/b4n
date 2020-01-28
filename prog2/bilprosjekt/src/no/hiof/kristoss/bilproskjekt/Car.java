package no.hiof.kristoss.bilproskjekt;

public class Car extends Frame {

    public Car(String merke, String modell, int arsmodell, int felg, int dekk, int lengde, int bredde, int høyde) {
        super(merke, modell, arsmodell, felg, dekk, lengde, bredde, høyde);
    }

    @Override
    public String toString(){
        return "Dette er merket "+ getMerke() + " " + getModell() + " og er fra " + getArsmodell()
                + "\n" + "Har en felgstorrelse på " + getFelg() + "tommer og med dekk på " + getDekk() + " tommer"
                + "\n" + "Lengden på " +getModell()+"en er " + getLengde() +"cm lang."
                + "\n" + "Høyden på " +getModell()+"en er " + getHøyde() +"cm høy."
                + "\n" + "Bredden på " +getModell()+"en er " + getBredde() +"cm bred.";
    }
}
