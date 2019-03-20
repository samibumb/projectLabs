package org.fasttrackit.Lab4;

import java.util.Scanner;

public class MedieAritmeticaSir {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = scan.nextInt();
        }

       float aritmetica=(float)sum/3;
        System.out.println(aritmetica);

    aritmetica();
    }


    private static float aritmetica(){

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Dati numerele :");
            sum = scan.nextInt();

        }

        float aritmetica=(float)sum/3;
        System.out.println(aritmetica);

        return (float)sum/3;

    }
}
