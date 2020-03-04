package no.hiof.kristoss.model;
import java.time.LocalDate;

public abstract class Dyr {
    private final int id;
    private String navn;
    private LocalDate fodselsDato;
    private static int dyreTeller;

    public Dyr(String navn) {
        this(navn, LocalDate.EPOCH);
    }

    public Dyr(String navn, LocalDate fodselsDato) {
        this.id = 1000 + dyreTeller++;
        this.navn = navn;
        this.fodselsDato = fodselsDato;
    }

    /**
     * Setter denne til final, slik at ingen av subklassene kan override den
     * ID skal kun håndteres av denne klassen
     */
    public final int getId() {
        return id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getFodselsDato() {
        return fodselsDato;
    }

    public void setFodselsDato(LocalDate fodselsDato) {
        this.fodselsDato = fodselsDato;
    }

    public static int getAntallDyr() {
        return dyreTeller;
    }

    @Override
    public String toString() {
        return navn + " ID:" + id;
    }
}