

public class Main{

  public static void main(String[] args){
    Kurs programmering2 = new Kurs("Prog2", "IT06932", 10);
    Kurs webutvikling = new Kurs("Web1", "IT06465432", 5);

    System.out.println(programmering2.getNavn() + " " + programmering2.getStudiePoeng() + " Studiepoeng.");

    Student nikolaTesla = new Student("Nikola", "Tesla", programmering2);
    nikolaTesla.setOppsattKurs(webutvikling); // endrer verdiet på kurset Tesla tar.

    Kurs kursTeslaTar = nikolaTesla.getOppsattKurs();

    System.out.println( nikolaTesla.getFornavn() + " tar " + kursTeslaTar.getNavn());
  }

}
