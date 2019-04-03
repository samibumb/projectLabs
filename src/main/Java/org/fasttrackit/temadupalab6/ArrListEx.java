package org.fasttrackit.temadupalab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrListEx {

    public static void main(String[] sami){

        List<String> list = new ArrayList<>();

        list.add("Branza");
        list.add("Telemea");
        list.add("Ana");
        list.add("Fruits");
        list.add("Legume");
        list.add("Andrei");
        list.add("Andreea");

      //ne va pune pe pozitia 0 zahar iar branza va fi pe pozitia 1
       list.add(0,"Zahar");
        System.out.println(list);
        for (String str : list){
            System.out.println(str);
        }

        //pt a adauga un element pe o pozitie anume folosim metoda set() aceasta stergand elementul initial de
        //pe pozitie
        list.set(2,"Shaorma");
        list.set(0,"Maimuta");
        System.out.println(list);

        //pentru a sorta alfabetic folosim metoda statica sort()  din clasa Collections
        Collections.sort(list);
        System.out.println(list);

        // pt a sorta nealfabetic folosim reverse()
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        /**sau
         *  Collections.reverse(list);
         */


        //daca lista contine acest element va returna true altfel false
       if(list.contains("Zacusca")){
           System.out.println("Contine");
       }else{
           System.out.println("Nu contine");
       }
        //sau
       boolean contine = list.contains("Zacusca");
        System.out.println("Contine ? "+contine);


        //pt a lua de pe o pozitie un element folosim get()
        String poz=list.get(2);
        System.out.println(poz);


        //indexOf() ne zice pe ce pozitie se afla elem respectiv,iar daca nu exista acel element se va afisa -1
        int unde =list.indexOf("Legume");
        System.out.println(unde);
    }
}
