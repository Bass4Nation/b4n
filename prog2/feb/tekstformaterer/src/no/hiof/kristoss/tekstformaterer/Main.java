package no.hiof.kristoss.tekstformaterer;

public class Main {

    public static void main(String[] args) {


        String tekst = "This is UnBEARabkee";

        StorTekstFormaterer storTekstFormaterer = new StorTekstFormaterer();
        System.out.println(storTekstFormaterer.formater(tekst));

        CamelCaseFormaterer camelCaseFormaterer = new CamelCaseFormaterer();
        System.out.println(camelCaseFormaterer.formater(tekst));



    }

/*
    public static  formaterTekst(Formaterer enFormaterer, String tekst){
        System.out.println(enFormaterer.formater(tekst));
    }
*/
}
