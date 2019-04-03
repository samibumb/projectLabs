package org.fasttrackit.temadupalab6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String[] sami) {

        List<String> list = new ArrayList<>();

        list.add("Branza");
        list.add("Telemea");
        list.add("Ana");
        list.add("Fruits");
        list.add("Legume");
        list.add("Andrei");
        list.add("Andreea");



        Iterator<String> iterator =list.iterator();
        String listVal = iterator.next();
        System.out.println("Getting first element : "+listVal);
        iterator.remove(); //sterge elementul de care a trecut,in cazul de fata primul element
        System.out.println("List after removing first element :"+list);


        String listVal1 = iterator.next();
        System.out.println("Getting second element : "+listVal1);
        iterator.remove();
        System.out.println("List after removing second element :"+list);




        //pentru a afisa toate elem fara a face next() de fiecare data folosim un while si hasNext()
        //!!obs nu va mai afisa elementele deja trecute mai sus

        while (iterator.hasNext()){
            String valoare=iterator.next();
            System.out.println("--------------");
            System.out.println(valoare);
        }

       iterator.remove(); //sterge ultimul element
        System.out.println("Final list :"+list);



    }
}
