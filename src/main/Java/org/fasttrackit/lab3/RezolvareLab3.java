package org.fasttrackit.lab3;

import java.util.Scanner;

public class RezolvareLab3 {

    public static void main(String[] args) {

        //Problema 1
        //Sa se calculeze media aritmetica a doua numere citite de la tastatura

        Scanner sc = new Scanner(System.in) ;
        double a,b,mAritmetica;

        System.out.print("a este :");
        a=sc.nextDouble();

        System.out.print("b este :");
        b=sc.nextDouble();

        mAritmetica=(a+b)/2 ;
        System.out.println("Media aritmetica este egala cu : "+mAritmetica);

    interval(8);

    }
    //Exercitiul 13

    public static void interval(int x) {

        if (x > 4 && x < 15) {
            System.out.println(x + " apartine intervalului [4,15]");

        } else {
            System.out.println(x + " este in afara intervalului [4,15]");
        }
    }



}


