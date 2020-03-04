package no.hiof.larseknu.oblig3;

public class CelestialBody {
    private String name;
    private double mass, radius;

    public CelestialBody(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("%s has a mass of %.0fkg and a radius of %.0fkm", name, mass, radius);
    }
}
