
public class Student2_main{


  public static void main (String[] args){

    Student elonMusk = new Student();

    elonMusk.setfornavn = "Elon";
    elonMusk.setetternavn = "Musk";
    elonMusk.setalder = 54; // et eksempel tall.
    elonMusk.setStudentId = "IT12eded1";

    elonMusk.printStudentInfo();

    elonMusk.setFornavn("Tester");

    elonMusk.printStudentInfo();

    Student thomasEdison = new Student("Thomas", "Edison", "32354", "354354", 10);

    thomasEdison.printStudentInfo();





  }
}
