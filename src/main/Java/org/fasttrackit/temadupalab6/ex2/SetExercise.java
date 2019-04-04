package org.fasttrackit.temadupalab6.ex2;

import org.fasttrackit.temadupalab6.ex2.Person;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {

    public static void main(String[] sami){

        Set<Person> list=new HashSet<>();

        Person p1 = new Person("Ion");
        Person p2 = new Person("Ana");
        Person p3 = new Person("Ion");

        list.add(p1);
        list.add(p2);
        list.add(p3);

        for (Person pers : list){

            System.out.println(pers);

        }
        System.out.println(p1.hashCode());

        System.out.println("Collection has finally "+list.size()+" elements.");

        /**In aceasta situtie vom avea elementul "Ion" de doua ori deoarece nu va lua in calcul numele
         * ci obiectele care au o denumire diferita primul Ion fiind p1 iar celalat p3.
         * Putem observa cum colectia Set ordoneaza automat in ordine alfabetica elementele.
         */

        /**Dupa ce vom face metodele equals&hashcode,metoda toString ne va returna doar un Ion
         * deoarece programul si-a dat seama ca e vorba de 2 String-uri identice si ca nu e vorba
         * doar ca obiectele sa fie identice , ceea ce nici nu se putea de altfel, ca doua obiecte sa
         * aiba acelasi nume.
         */

    }
}
