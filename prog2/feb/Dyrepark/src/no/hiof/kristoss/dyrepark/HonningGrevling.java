package no.hiof.kristoss.dyrepark;

import java.time.LocalDate;

public class HonningGrevling extends Dyr {

    private int antallSlagerDrept;

    public HonningGrevling(String name, LocalDate birthdate){
        super(name, birthdate);
        antallSlagerDrept = 0;
    }

    public int getAntallSlagerDrept() {
        return antallSlagerDrept;
    }

    public void dreptEnSlangeTil() {
        antallSlagerDrept++;
    }
}
