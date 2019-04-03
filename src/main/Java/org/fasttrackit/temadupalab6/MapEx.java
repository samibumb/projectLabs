package org.fasttrackit.temadupalab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

    public static void main(String[] sami){

       Map<Integer,String> mapCol = new HashMap<>();

        //with put() method we put elements in the map
        mapCol.put(1,"Sami");
        mapCol.put(3,"Ionut");
        mapCol.put(45,"Andrei");
        mapCol.put(32,"America");
        mapCol.put(245,"Sushi");
        mapCol.put(49,"Morcovi");
        mapCol.put(72,"Ananas");

        System.out.println(mapCol);
        //HashMap nu sorteaza elementele ci le va pune in colectie aleatoriu pt a sorta trebuie algoritm si inca
        //nu il stiu


        //if we want to remove something from list we use remove() method and we  put inside the method
        //int or both int and String
       mapCol.remove(1);
        System.out.println(mapCol); //Sami removed

       //if we want to get a value from a specified key we use get() method
        System.out.println(mapCol.get(32));
        //this method will display America

        System.out.println("Collection has "+mapCol.size()+" elements"); //cate elemente are colectia

        //displays the map
        Set<Integer> keys=mapCol.keySet();
        for (Integer nr : keys){
            System.out.println(nr+"="+mapCol.get(nr));
        }


    }
}
