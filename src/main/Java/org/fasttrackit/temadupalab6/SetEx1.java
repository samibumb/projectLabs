package org.fasttrackit.temadupalab6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {

    public static void main(String[] args) {

        Set<Integer> setList = new HashSet<>();

        setList.add(1);
        setList.add(2);
        setList.add(3);
        setList.add(4);
        setList.add(4);
        boolean con =setList.contains(7); // colectia nu contine numarul 7,va returna valoarea false
        System.out.println("Contine nr :" +con);
        setList.add(7);
        boolean contine = setList.contains(7); //colectia va contine nr 7
        System.out.println("Collection after adding 7 :"+contine);

        System.out.println("Colectia are " +setList.size()+" elemente");

        /**Dimensiunea arata ca sunt 4 elemente in lista deoarece colectia Set nu adauga
         * de doua ori acelasi numar,stergandu-l instantaneu,iar aceasta colectie de tip
         * Set sorteaza instantaneu,in ordine alfabetica(A-Z) sau numerica(-INFINIT->+INFINIT),
         * elementele sale.
         */
        int cnt=1;
        while (cnt<=setList.size()) {
            for (Integer set : setList) {
                System.out.println(cnt+". "+set);
                cnt++;
            }
        }

        System.out.println("\n"+"------TreeSet exercise ---------");
        treeSet();

       }

    public static void treeSet(){
        Set<String> set =new TreeSet<>();

        set.add("Ancuta");
        set.add("Ana");
        set.add("Andreea");
        set.add("Andrei");
        set.add("Ancuta");
        for (String tree :set){
            System.out.println(tree);
        }

        System.out.println("\n"+"TreeSet with iterator :");
        Iterator<String> iterator =set.iterator();
        int count=1;
        while (count<=set.size()) {
            while (iterator.hasNext()) {
                String nume = iterator.next();
                System.out.println(count + "." + nume);
                count++;
            }

        }

    }
}
