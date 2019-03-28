package org.fasttrackit.temadupalab5;

public class Boy extends Om {

    private String firstName;

    private String lastName;

    private int age;

    private char gender;

    private String address;

    public void goTosleep(int hour){
        if (hour>9){
            throw new ArithmeticException("It is to late for you kid");
        }else{
            System.out.println("ZzZz");
        }
    }

    public void playing(int maxHourToStayOutside) throws ArithmeticException{
        if(maxHourToStayOutside>9){

            throw new ArithmeticException("BauBau steals you.");
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
