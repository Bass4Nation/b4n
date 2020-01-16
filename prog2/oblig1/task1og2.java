
public class task1og2{

  static void helloWorld(){
    // Oppgave 2.1
    // Lag programmet Hello World! ved hjelp av din favoritt teksteditor,
    // og kjør dette ved hjelp av Java SDK i terminalen/kommandolinja.
    System.out.print("Hello, World!" + "\n" + "\n");
  }

  static void moon(){
    // Oppgave 2.2
    // Gravitasjonen på månen er ca. 17 prosent av jordens. Skriv et program som beregner din vekt på månen.
    double x = 90; // vekten i kg på jorda
    double y = 9.81; // m/s^2
    double z = 1.622; // m/s^2
    double vekt = ( ( x / y ) * z ); // Vekten på månen regnestykke (10 er kg på jorden (første tallet i regnestykket))
    int avrundetVekt = (int)vekt; // Et tall uten desimaler.

    System.out.print("This is your weight on the moon : " + avrundetVekt + " kg." + "\n");
    System.out.print("This is your weight on the moon : " + vekt + " kg." + "\n"); // Med alle tallene etter komma.

  }


  public static void main(String[] args){ // her så blir begge funskjonene laget over kjørt.
    helloWorld();
    moon();

  }
}
