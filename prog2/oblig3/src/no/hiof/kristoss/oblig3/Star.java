package no.hiof.kristoss.oblig3;

public class Star extends CelestialBody {
    private double effectiveTemperature;

    public Star(String name, double mass, double radius, double effectiveTemperature) {
        super(name, mass, radius);
        this.effectiveTemperature = effectiveTemperature;
    }

    public double getMassInMsun() {
        return getMass() / 1.98892E30;
    }

    public double getReadiusInRsun() {
        return getRadius() / 695700;
    }


    public double getEffectiveTemperature() {
        return effectiveTemperature;
    }

    public void setEffectiveTemperature(double effectiveTemperature) {
        this.effectiveTemperature = effectiveTemperature;
    }

    @Override
    public String toString() {
        return String.format("%s has a radius of %.2fkm, a mass of %.2fkg and a effective temperature of %.2fK", getName(), getRadius(), getMass(), effectiveTemperature);
    }
}
