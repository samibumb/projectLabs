package org.fasttrackit.temadupalab6.arrlistex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PersonList implements Runnable{


    @Override
    public void run() {
        List<String> list = new LinkedList<>();

        list.add("Ana are mere");
        list.add("John ");
        list.add("Andrei");
        list.add(0,"Sami");
        Collections.sort(list);
        ((LinkedList<String>) list).addLast("Ana nu mai are mere");

        try{
             for(String str :list){
                 Thread.sleep(1500);
                 System.out.println(str);
                 Thread.sleep(1000);
                 System.out.println("--------------");
             }
            System.out.println("List finished.");
    }catch(InterruptedException i){
            System.out.println("List interrupted temporary.");
        }
    }
}
