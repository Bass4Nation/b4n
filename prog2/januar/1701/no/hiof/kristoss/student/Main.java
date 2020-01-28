package no.hiof.kristoss.student;

import net.bass.b4n.studentprosjekt;

/**
* Klasse for å starte programmet vårt
*/
public class Main {
  /**
  * Javaapplikasjonens startpunkt (denne metoden blir kjørt når java-applikasjonen kjøres)
  */
  public static void main(String[] args) {

    System.out.println("HEI");

    Student kristoss = new Student("Kristoffer", "Soderkvist" , "2020159864");

    kristoss.printStudentInformasjon();
  }

  
}
