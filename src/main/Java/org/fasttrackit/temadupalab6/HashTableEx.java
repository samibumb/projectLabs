package org.fasttrackit.temadupalab6;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;

public class HashTableEx {

    public static void main(String[] sami){

        Hashtable<String,String> hsht =new Hashtable<>();

        hsht.put("one","Sami");
        hsht.put("two","Dan");
        hsht.put("five","John");
        hsht.put("two","Marius");  //va afisa ultimul "two",Nu va scrie de doua ori

       //size(),get(),contains(),etc.

       //displays the table
        Set<String> key = hsht.keySet();
        for (String tab : key){
            System.out.println(tab+" "+hsht.get(tab));
        }

    }
}
