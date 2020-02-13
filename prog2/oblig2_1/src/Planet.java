public class Planet {

    private String name;
    private double radius, mass;

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
//----------------------------Utregning OPPG 2.4 -----------------------------
    public double mJ(){
        return mass/1.898E27;
    }
    public double rJ(){
        return radius/69911;
    }
//-------------------------Utregning OPPG 2.5 ---------------------------------
    public double surfaceGravity(){
        return ((0.00000000006674*mass)/(radius*radius));
    }
//-------------------------Utregning OPPG 3.1 -------------------------------

public double mE(){
        return mass/5.972E24;
}
public double rE(){
        return radius/6371;
}
//----------------------------------------------------------------------------




    @Override
    public String toString(){
        return "Planeten " + name + " har en radius på " + radius + "km og en masse på " + mass + "kg.";
    }

}
