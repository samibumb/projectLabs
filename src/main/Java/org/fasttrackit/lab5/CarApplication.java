package org.fasttrackit.lab5;

public class CarApplication {

    public static void main(String[] sami){

        Car car1 = new Car();
        car1.setName("Mercedes");
        car1.setModel("S63AMG");
        car1.setPower(500);

        Car car2 = new Car();
        car2.setName("Audi");
        car2.setModel("RS6");
        car2.setPower(750);

        Car car3 = new Car();
        car3.setName("Ford");
        car3.setModel("Focus");
        car3.setPower(140);

        Car car4 = new Car("BMW","320");
        System.out.println("We have a "+car4.getName()+" "+car4.getModel()+" as a fourth car.");

        Car car5 = new Car();
        System.out.println(car5);

        Autobus myBus6 = new Autobus();
        myBus6.setName("Mercedes");
        myBus6.setModel("model");
        myBus6.composteazaBilete();

        Camion myTruck7 = new Camion();
        myTruck7.setName("Scania");
        myTruck7.setModel("Man");
        myTruck7.transportMarfa();


        car1.run();
        car2.run();
        car3.run();
        car4.run();
        car5.run();

        System.out.println("We have " + Car.nrOfCars + " car/s.");




    }
}
