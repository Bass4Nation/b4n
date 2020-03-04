package no.hiof.kristoss.oblig3;

public class NaturalSatellite extends CelestialBody {

    private double semiMajorAxis, eccentricity;
    private int orbitalPeriod;
    private Star centralCelestialBody;

    public NaturalSatellite(String name, double mass, double radius, double semiMajorAxis, double eccentricity, int orbitalPeriod, Star centralCelestialBody) {
        super(name, mass, radius);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(int eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(int orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Star getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(Star centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }

    @Override
    public String toString(){
        return "Tar ikke inn informasjon i denne klassen.";
    }
}
