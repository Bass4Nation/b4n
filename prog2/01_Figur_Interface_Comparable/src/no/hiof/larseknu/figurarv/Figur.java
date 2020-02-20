package no.hiof.larseknu.figurarv;

/**
 * Abstract Klasse som representerer en generisk figur
 * Kan ikke opprettes egne objekter av Figur-klassen (siden den er abstract)
 */
public abstract class Figur implements Tegnbar, Comparable<Figur> {
    private String farge;

    public Figur(String farge) {
        this.farge = farge;
    }

    public abstract double areal();

    public abstract double omkrets();


    @Override
    public int compareTo(Figur sammenligningsFigur) {

        return (int)(this.areal() - sammenligningsFigur.areal());
    }



    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }
}
