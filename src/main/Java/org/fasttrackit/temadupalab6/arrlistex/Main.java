package org.fasttrackit.temadupalab6.arrlistex;

public class Main {

    public static void main(String[] args){

        PersonList p = new PersonList();
        Thread thread = new Thread(p);

        thread.start();
        //thread.interrupt();
    }
}
