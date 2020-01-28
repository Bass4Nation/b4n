public class Star{

    private String name;
    private double radius, mass, effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
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

    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(double effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    public double mS(){
        return mass/1.98892E30;
    }
    public double rS(){
        return radius/695700;
    }

    @Override
    public String toString(){
        return "Stjerne " + name + " har en radius på " + radius + "km og en masse på " + mass + "kg, med en temperatur på "+ effectiveTemp + "*C.";
    }

}
