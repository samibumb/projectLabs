package org.fasttrackit.temadupalab5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class MainClass {

    public static void main(String[] args){

        Om om = new Om();
        om.setFirstName("Darius");
        om.setLastName("Pop");
        om.setAddress("Cluj");
        om.setAge(23);
        System.out.println(om);
        om.eating(80);
        om.goingToWork(8,4.59);
        om.sleeping();



        Om marius = new Om();
        marius.goingToWork(8,4.3);



        Om danut = new Clothes();
        ((Clothes) danut).setTypeOfClothing("jeans");
        ((Clothes) danut).setTypeOfClothing("shirt");



        Om sami = new Om("Sami","Bumb",21,"Cluj");
        System.out.println(sami.getFirstName()+" "+sami.getLastName()+" has "+sami.getAge()+" years old.");



        Om mircea = new Om("Mircea","Bob",40,"Bucuresti");
        System.out.println(mircea.getFirstName()+" "+mircea.getLastName()+" has "+
                        mircea.getAge()+" years old and is from "+mircea.getAddress());



        Boy boy1 = new Boy("Ionut","Ilis",5,"Baia Mare",'M');
        System.out.println(boy1.getFirstName()+" "+boy1.getLastName()+" has "+ boy1.getAge()+
                " years old.It is a "+boy1.getGender()+"(male)."+"He's from "+ boy1.getAddress());



        Boy boy2 = new Boy();
        System.out.println(boy2);
        try{
            boy2.goTosleep(7);
        }catch(ArithmeticException e){
            System.out.println("Once per week kid can sleep whenever he want");
        }
       boy2.playing(7);



        List<Om> lista = new ArrayList<Om>();
        lista.add(sami);
        lista.add(mircea);
        lista.add(om);
        lista.add(marius);

        System.out.println("The list of persons:");
        for (Om listaOm : lista){
            System.out.println(listaOm);
        }



        List<Boy> lista2 = new LinkedList<Boy>();
        lista2.add(boy2);
        System.out.println("Another list with boys:");
        for (Om listaBoy : lista2){
            System.out.println(listaBoy);
        }
    }




}
