package no.hiof.kristoss.dyrepark;

import java.util.ArrayList;

public class Dyrepark {

    private String name;
    private ArrayList<Dyr> DyreList = new ArrayList<>();

    public Dyrepark(String name){
        this.name = name;
    }

    public ArrayList<Dyr> getDyreList() {
        return new ArrayList<>(DyreList);
    }

    public void leggTilEttDyr(Dyr ettDyr) {
        DyreList.add(ettDyr);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}


