package org.fasttrackit.temadupalab5;

public class Boy extends Om {

    private String firstName;

    private String lastName;

    private int age;

    private char gender;

    private String address;

    public void goTosleep(int hour){
        if (hour>9){
            throw new IllegalArgumentException("It is to late for you kid");
        }else{
            System.out.println("zZz");
        }
    }

    public Boy(){
        firstName="Danut";
        lastName="Adrian";
    }

    public String toString(){
        return firstName+" "+lastName;
    }


    public Boy(String firstName , String lastName,int age,String address,char gender){
        super(firstName,lastName,age,address);
        this.gender=gender;

    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
