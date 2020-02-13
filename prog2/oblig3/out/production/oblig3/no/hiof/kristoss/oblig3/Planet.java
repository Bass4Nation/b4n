package no.hiof.larseknu.oblig2;

public class Planet {
    private String name;
    private double mass, radius;

    public Planet(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }

    public double getSurfaceGravity() {
        // g = GM / R^2
        return (6.67408E-11 * mass) / Math.pow(getRadiusInMeter(), 2);
    }

    public double getMassInMjup() {
        return mass / 1.898E27;
    }

    public double getRadiusInRjup() {
        return radius / 71492;
    }

    public double getMassInMearth() {
        return mass / 5.972E24;
    }

    public double getRadiusInRearth() {
        return radius / 6371;
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

    private double getRadiusInMeter() {
        return radius * 1000;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %.2fkm and a mass of %.2fkg", name, radius, mass);
    }
}
