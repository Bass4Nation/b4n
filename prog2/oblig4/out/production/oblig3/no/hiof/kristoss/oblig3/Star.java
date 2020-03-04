package no.hiof.larseknu.oblig2;

public class Star {
    private String name;
    private double radius, mass, effectiveTemperature;

    public Star(String name, double radius, double mass, double effectiveTemperature) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemperature = effectiveTemperature;
    }

    public double getMassInMsun() {
        return mass / 1.98892E30;
    }

    public double getReadiusInRsun() {
        return radius / 695700;
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

    public double getEffectiveTemperature() {
        return effectiveTemperature;
    }

    public void setEffectiveTemperature(double effectiveTemperature) {
        this.effectiveTemperature = effectiveTemperature;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %.2fkm, a mass of %.2fkg and a effective temperature of %.2fK", name, radius, mass, effectiveTemperature);
    }
}
