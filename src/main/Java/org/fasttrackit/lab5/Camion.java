package org.fasttrackit.lab5;

public class Camion extends Car {

    private String bena;

    private int tonaj;

    private String name;

    private String model;


    public void transportMarfa(){
        System.out.println("Transport marfa.");
    }

    public Camion(){
        super();

    }

    public Camion(String name , String model){
        super(name,model);


    }


}
