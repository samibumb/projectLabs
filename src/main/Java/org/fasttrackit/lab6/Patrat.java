package org.fasttrackit.lab6;

public class Patrat extends FiguraGeometrica {

   private int latura;

    public Patrat(int laturaPatrat){
        this.latura=laturaPatrat;
    }

    public void arie(){
        int latura=5;
        int arie=0;
        arie=latura*latura;
        System.out.println("Arie patrat:"+arie);
    }

    public void perimetru(){
        int latura=4;
        int perimetru=latura*4;
        System.out.println("Perimetru patrat"+perimetru);
    }

    public void desen(){
        System.out.println("Am desenat un "+nume);
    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
}
