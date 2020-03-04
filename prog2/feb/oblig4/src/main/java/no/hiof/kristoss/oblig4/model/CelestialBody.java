package no.hiof.kristoss.oblig4.model;

public abstract class CelestialBody implements Comparable<CelestialBody> {

    private final int id;
    private String name, pictureUrl;
    private double mass, radius;
    private static int teller;


    public CelestialBody(String name, double mass, double radius, String pictureUrl) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.pictureUrl = pictureUrl;
        this.id = 1000 + teller++;
    }


    public CelestialBody(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.id = 0;
    }

    public final int getId() {
        return id;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
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
    public int compareTo(CelestialBody annetObjekt) {
        return this.id - annetObjekt.getId();
    }
     

    @Override
    public String toString() {
        return name + " ID:" + id;
    }
}


