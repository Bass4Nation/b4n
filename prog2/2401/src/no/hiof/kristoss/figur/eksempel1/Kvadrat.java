package no.hiof.kristoss.figur.eksempel1;

public class Kvadrat extends Rektangel {

    private double side;


    public Kvadrat (double side){
        super(side, side);

        this.side = side;
    }

    @Override
    public String toString(){
        return "Kvadrat med siden: " + side;
    }

}
