package no.hiof.kristoss.bilproskjekt;

public class Product {
    private String merke, modell;
    private int arsmodell;

    public Product(String merke, String modell, int arsmodell) {
        this.merke = merke;
        this.modell = modell;
        this.arsmodell = arsmodell;
    }

    public String getMerke() {
        return merke;
    }

    public String getModell() {
        return modell;
    }

    public int getArsmodell() {
        return arsmodell;
    }

    }
