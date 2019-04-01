package org.fasttrackit.lab6;

import java.util.*;

public class Main {

    public static void main(String[] args){

        Patrat patrat1 = new Patrat(5);
        patrat1.arie();
        patrat1.nume="patrat";
        patrat1.desen();

        FiguraGeometrica cerc = new Cerc();
//        Cerc cast=(Cerc) cerc;
//        cast.setRaza(3);
        cerc.nume="cerc";
        cerc.desen();
        ((Cerc) cerc).setRaza(3);


       FiguraGeometrica p = new Patrat(6);
        System.out.println("Patratul:");
        p.arie();
       p.nume="patrat";
        p.desen();
        p.perimetru();

        FiguraGeometrica c = new Cerc();
        System.out.println("\n"+"Cercul:");
        c.arie();
       c.nume="cerc";
        c.desen();
        c.perimetru();

        FiguraGeometrica t = new Triunghi();
        System.out.println("\n"+"Triunghiul:");
        t.arie();
        t.perimetru();
        t.desen();


        Set<FiguraGeometrica> figuriGeometriceSet = new HashSet<>();
        figuriGeometriceSet.add(cerc);
        figuriGeometriceSet.add(patrat1);
        figuriGeometriceSet.add(p);
        figuriGeometriceSet.add(t);

        for (FiguraGeometrica fig:figuriGeometriceSet) {
            System.out.println("------------");
            fig.desen();


        }

        List<FiguraGeometrica> list = new ArrayList<>();
        list.add(c);
        list.add(p);
        list.add(t);

        list.add(0,p);

        for (FiguraGeometrica fig : list){
            System.out.println("--------arraylist---------");
            fig.desen();
        }


    }
}
