package no.hiof.kristoss.dyrepark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Dyrepark kristiansand = new Dyrepark("Kristiansand Dyrepark");

        Sjimpanse arne = new Sjimpanse("Arne", LocalDate.of(2017, 8, 8), 75 );
        HonningGrevling nils = new HonningGrevling("Nils", LocalDate.of(2019,2,5));
        Panda tina = new Panda("Tina", "Sort");

        kristiansand.leggTilEttDyr(arne);
        kristiansand.leggTilEttDyr(nils);
        kristiansand.leggTilEttDyr(tina);

        System.out.println(String.format("%d Sjimpansen %s har en IQ på %d", arne.getId(), arne.getName(), arne.getIq()));
        System.out.println(String.format("%d Honninggrevling %s har drept %d slanger", nils.getId(), nils.getName(), nils.getAntallSlagerDrept()));
        System.out.println(String.format("%d Pandaen %s har %s belte" , tina.getId(), tina.getName(), tina.getBelteFarge()));

        ArrayList<Dyr> dyreListeKopi = kristiansand.getDyreList();
        System.out.println("-------------------");
        skrivUtListe(dyreListeKopi);
        System.out.println("-------Standard sortering over------------");

        Collections.sort(dyreListeKopi, new SorteringAvDyrPaaId());
        skrivUtListe(dyreListeKopi);
        System.out.println("-------ID sortering over------------");

        Collections.sort(dyreListeKopi, new Comparator<Dyr>() {
            @Override
            public int compare(Dyr o1, Dyr o2) {
                return o1.getBirthdate().compareTo(o2.getBirthdate());
            }
        });
        skrivUtListe(dyreListeKopi);
        System.out.println("-------Dato sortering over------------");

    }

    private static void skrivUtListe(ArrayList<Dyr> dyreListe){
        for (Dyr etDyr : dyreListe){
            System.out.println(etDyr);
        }
    }
}
