
public class Planet{

  private String navn;
  private double radius;
  private double gravitasjon;
// ---------------------------------------------------------------------------
  public String getName(){  // get metode for navn
    return navn;
  }

  public double getRadius(){ // get metode for radius
    return radius;
  }

  public double getGravitasjon(){ // get metode for gravitasjon
    return gravitasjon;
  }
// ---------------------------------------------------------------------------
  public void setName(String newName){ //  set metode for navn
    this.navn = newName;
  }

  public void setRadius(double newRadius){ //  set metode for radius
    this.radius = newRadius;
  }

  public void setGravitasjon(double newGravitasjon){ //  set metode for gravitasjon.
    this.gravitasjon = newGravitasjon;
  }

// ---------------------------------------------------------------------------
  public Planet(String name, double rad, double gravity){
    navn = name;
    radius = rad;
    gravitasjon = gravity;
  }
//----------------------------------------------------------------------------
  public void printInfoPlanet(){ // Printer ut infoen som blir lagt inn om Planetene.

    System.out.println("Planeten "+ navn + " har en radius på " + radius + " km og en gravitasjon på " + gravitasjon + " m/s^2");
  }

}
