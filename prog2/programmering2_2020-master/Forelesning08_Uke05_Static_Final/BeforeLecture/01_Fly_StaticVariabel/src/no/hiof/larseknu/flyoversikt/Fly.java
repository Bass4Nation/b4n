package no.hiof.larseknu.flyoversikt;

public class Fly {
    // Instansvariabler
    private String modell;
    private int seter;
    private int passasjerer;

    public Fly() {
    }

    public Fly (String modell, int seter) {
        this.modell = modell;
        this.seter = seter;
        this.passasjerer = 0;
    }

    public Fly (String modell, int seter, int passasjerer) {
        this.modell = modell;
        this.seter = seter;
        this.passasjerer = passasjerer;
    }

    public void leggTilEnPassasjer() {
        // Sjekker om antallet passasjerer er mindre enn antallet seter
        if (passasjerer < seter) {
            // Hvis det er mindre, legg til en passasjer
            passasjerer++;
        }
        else
            // Hvis det ikke er ledige seter, skriv ut melding
            System.out.println("Ingen ledige seter tilgjengelig");
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
}