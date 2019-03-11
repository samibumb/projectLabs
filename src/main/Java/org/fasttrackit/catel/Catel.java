package org.fasttrackit.catel;

public class Catel {

    public void setName(String wantedName) {
        name = wantedName;
    }

    public String getName() {
        return name;
    }

    private String name ;

    private int weight ;

    private int age ;

    public int getAge() {
        return age;
    }



    public void eating() {
        weight++ ;

        if(weight>=10) {
            age++ ;
        }
    }

    public void barking() {
        System.out.println("Ham Ham");
    }

}
