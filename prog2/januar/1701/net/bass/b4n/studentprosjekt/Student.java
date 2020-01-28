package net.bass.b4n.studentprosjekt;

public class Student{

  private String fornavn, etternavn, fodselsnummer;

  public Student(String fornavn, String etternavn, String fodselsnummer){
    this.fornavn = "Bass4";
    this.etternavn ="Nation";
    this.fodselsnummer = "20201020";
  }

  public void printStudentInformasjon(){
    System.out.println(fornavn + "  " + etternavn);
  }
}
