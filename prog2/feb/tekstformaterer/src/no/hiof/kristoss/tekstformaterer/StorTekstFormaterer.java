package no.hiof.kristoss.tekstformaterer;

public class StorTekstFormaterer implements Formaterer {

    @Override
    public String formater(String tekstSomSkalFormateres) {
        return tekstSomSkalFormateres.toUpperCase();
    }
}
