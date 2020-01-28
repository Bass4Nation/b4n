public class PlanetSystem  {

    private String name, centerStar, planets;

    public PlanetSystem(String name, String centerStar, String planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCenterStar() {
        return centerStar;
    }

    public void setCenterStar(String centerStar) {
        this.centerStar = centerStar;
    }

    public String getPlanets() {
        return planets;
    }

    public void setPlanets(String planets) {
        this.planets = planets;
    }

    @Override
    public String toString(){
        return "Dette solsystmet har navnet "+ name + " og en stjerne med navnet " + centerStar + ". Og planeter som heter " + planets + ".";
    }

}
