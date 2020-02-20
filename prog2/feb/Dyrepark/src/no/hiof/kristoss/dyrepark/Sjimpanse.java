package no.hiof.kristoss.dyrepark;

import java.time.LocalDate;

public class Sjimpanse extends Dyr {

    private int iq;

    public Sjimpanse (String name, LocalDate birthdate, int iq){
        super(name, birthdate);
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }



}
