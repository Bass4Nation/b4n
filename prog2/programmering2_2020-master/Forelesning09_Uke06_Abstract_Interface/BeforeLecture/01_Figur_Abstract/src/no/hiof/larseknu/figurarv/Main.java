package no.hiof.larseknu.figurarv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5,"Rosa");

        Sirkel sirkelen = new Sirkel(3);


        Kvadrat enKvadrat = new Kvadrat(6,"gul");



        System.out.println(rektangelet + " Areal: " + rektangelet.areal() + " Omkrets: " + rektangelet.omkrets());
        System.out.println(String.format("%s Areal på %f Omkrets på %f med en farge som er %s", enKvadrat,enKvadrat.areal(),enKvadrat.omkrets(),enKvadrat.getFarge()));
        // String.format() gjør det her mulig å skrive en mer oversiktling string,
        // i tillegg kan man gjøre praktiske ting som å runde av double-verdien til å kun vise 2 desimaler
        System.out.println(String.format("%s Areal: %.2f Omkrets %.2f",sirkelen, sirkelen.areal(), sirkelen.omkrets()));

        rektangelet.tegn();
        sirkelen.tegn();
    }
}
