package org.fasttrackit.lab6;

public class Cerc extends FiguraGeometrica {

   private int raza=4;

    public void arie(){
      float arie=(float)((2*Math.PI*raza)/2);
        System.out.println("Arie cerc :"+arie);
    }

    public void perimetru(){
        int perimetru=(int)(2*Math.PI*raza);
        System.out.println("Perimetru cerc :"+perimetru);
    }

    public void desen(){
        System.out.println("Am desenat un "+nume);
    }


    public void setRaza(int razaCerc) {
        this.raza = razaCerc;
    }
}
