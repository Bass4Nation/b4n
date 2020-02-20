package no.hiof.kristoss.dyrepark;

public class Panda extends Dyr {

    private String belteFarge;

    public Panda(String name,String BelteFarge) {
        super(name);
        this.belteFarge = belteFarge;
    }

    public String getBelteFarge() {
        return belteFarge;
    }

    public void setBelteFarge(String belteFarge) {
        this.belteFarge = belteFarge;
    }
}
