package no.hiof.kristoss.oblig4.model;

public class Planet extends NaturalSatellite{

    final static double Mjup = 1.898E27;
    final static double Rjup = 71492;
    final static double Mearth = 5.972E24;
    final static double Rearth = 6371;


        public Planet(String name, double mass, double radius, double semiMajorAxis, double eccentricity, int orbitalPeriod, Star centralCelestialBody) {
            super(name, mass, radius, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
        }
        public Planet(String name, double mass, double radius, double semiMajorAxis, double eccentricity, int orbitalPeriod, String pictureUrl) {
            super(name, mass, radius, semiMajorAxis, eccentricity, orbitalPeriod, pictureUrl);
        }


        public double getSurfaceGravity() {
        // g = GM / R^2AS
        return (6.67408E-11 * getMass()) / Math.pow(getRadiusInMeter(), 2);
    }

    public double getMassInMjup() {
        return getMass() / Mjup;
    }

    public double getRadiusInRjup() {
        return getRadius() / Rjup;
    }

    public double getMassInMearth() {
        return getMass() / Mearth;
    }

    public double getRadiusInRearth() {
        return getRadius() / Rearth;
    }

    private double getRadiusInMeter() {
        return getRadius() * 1000;
    }


    @Override
    public String toString() {
        return String.format("%s", getName());

    }/*    @Override
    public String toString() {
        return String.format("%s has a radius of %.2fkm and a mass of %e kg. %s travel around %s at a axis on %f and " +
                "\nhave a eccentricity at %f at takes %d to take one lap around.",
                getName(), getRadius(), getMass(), getName(), getCentralCelestialBody().getName(), getSemiMajorAxis(), getEccentricity(), getOrbitalPeriod() );

    }*/

}
