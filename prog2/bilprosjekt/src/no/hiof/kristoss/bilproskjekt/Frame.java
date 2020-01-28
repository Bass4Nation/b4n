package no.hiof.kristoss.bilproskjekt;

public class Frame extends Wheel {
    private int lengde, bredde, høyde;


    public Frame(String merke, String modell, int arsmodell, int felg, int dekk, int lengde, int bredde, int høyde) {
        super(merke, modell, arsmodell, felg, dekk);
        this.lengde = lengde;
        this.bredde = bredde;
        this.høyde = høyde;
    }

    public int getLengde() {
        return lengde;
    }

    public int getBredde() {
        return bredde;
    }

    public int getHøyde() {
        return høyde;
    }
}
