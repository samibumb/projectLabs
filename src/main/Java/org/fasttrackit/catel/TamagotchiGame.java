package org.fasttrackit.catel;

public class TamagotchiGame {

    public static void main(String[] args){

        Catel dog1 = new Catel();
        dog1.setName("Rex");


        Catel dog2 = new Catel();
        dog2.setName("Rufus");


        for(int zi=0;zi<15;zi++) {

            dog2.eating();

        }
        System.out.println("Catelul "+" "+dog2.getName()+" are varsta de " +dog2.getAge()+ " ani.");

    }
}
