package no.hiof.kristoss.dyrepark;

import java.time.LocalDate;

public class Dyr implements Comparable<Dyr>{

    private String name;
    private final int id;
    private LocalDate birthdate;

    @Override
    public int compareTo(Dyr sammenLigningsDyr) {
        return name.compareTo(sammenLigningsDyr.getName());
    }


    private static final int START_ID = 1000;
    private static int animalCounter = START_ID ;

    public Dyr(String name){
        this(name, LocalDate.EPOCH);

    }

    public Dyr(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
        id = ++animalCounter;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString(){
        return id + " - "+ name + " "+ birthdate;
    }

}
