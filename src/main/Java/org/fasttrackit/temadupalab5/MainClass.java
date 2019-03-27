package org.fasttrackit.temadupalab5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static void main(String[] args){

        Om om = new Om();

        om.sleeping();
        om.eating(80);
        om.goingToWork(8,4.59);
        om.setFirstName("Darius");
        om.setLastName("Pop");
        om.setAge(23);


        System.out.println(om);

        Om marius = new Om();
        marius.goingToWork(8,4.3);


        Om sami = new Om("Sami","Bumb",21,"Cluj");
        System.out.println(sami.getFirstName()+" "+sami.getLastName()+" has "+sami.getAge()+" years old.");

        Om mircea = new Om("Mircea","Bob",40,"Bucuresti");
        System.out.println(mircea.getFirstName()+" "+mircea.getLastName()+" has "+
                        mircea.getAge()+" years old and is from "+mircea.getAddress());

        Boy boy1 = new Boy("Ionut","Ilis",5,"Baia Mare",'M');

        System.out.println(boy1.getFirstName()+" "+boy1.getLastName()+" is a "+boy1.getGender()+"(male).");

        Boy boy2 = new Boy();
        System.out.println(boy2);
        boy2.goTosleep(8);


        List<Om> lista = new ArrayList<Om>();

        lista.add(sami);
        lista.add(mircea);
        lista.add(om);
        lista.add(marius);
        System.out.println(lista);

        List<Boy> lista2 = new LinkedList<Boy>();

        lista2.add(boy2);
        System.out.println(lista2);
    }
}
