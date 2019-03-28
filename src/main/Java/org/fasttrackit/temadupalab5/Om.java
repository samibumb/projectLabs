package org.fasttrackit.temadupalab5;

public class Om {

    private String firstName;

    private String lastName;

    private int age;

    private String address;

    private String phoneNumber;


    public void eating(double kilograms) {
        if (kilograms > 100) {
            throw new ArithmeticException("Go to the gym.You are fat.");
        } else {
            System.out.println("Keep eating!");
        }
    }


    public void sleeping() {
        int a = 7;
        System.out.println("Sleeping until " + a + " o'clock");
    }

    public void goingToWork(double going, double comingHome) {


        if (going < 8 || comingHome > 5) {
            throw new ArithmeticException("You must go home.Is already 5!");
        } else if (going < 5) {
            System.out.println("Stay at work!");
        } else {
            System.out.println("Go home anyway");
        }

    }

    public Om() {

        firstName = "Marius";
        lastName = "Andrei";
        age = 30;
        address = "Romania";

    }

    public String toString() {
        return firstName + " " + lastName + " has " + age + " and is from "+address;
    }

    public Om(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


    public Om(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String getFirstName() {
        if (firstName.equals("")) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.equals("")) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }

        this.firstName = firstName;
    }

    public String getLastName() {
        if (lastName.equals("")) {
            throw new IllegalArgumentException("First name cannot be empty.");
        }
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.equals("")) {
            throw new IllegalArgumentException("Last name cannot be empty.");
        }
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
