package org.fasttrackit.lab5;



public class Car {

    public static int nrOfCars=0;

    private String name;

    private String model;

    private int power;



    public void run(){
        System.out.println("The car " + name + " is running");
    }

    public void transportPeople(){
        System.out.println("I carry people.");
    }


    public Car(){
        System.out.println("Constructor called");
    nrOfCars++;
        name="Audi";
        model="A6";
    }

    public Car(String name, String model){
       this();
        this.name =name;
        this.model=model;
    }


    public String toString(){
        return name+" "+model+" is za best!";
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

}
