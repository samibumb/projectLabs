package org.fasttrackit.lab3;

import java.util.Scanner;

public class RezolvareLab3 {

    public static void main(String[] args) {

        //Problema 1
        //Sa se calculeze media aritmetica a doua numere citite de la tastatura

        Scanner sc = new Scanner(System.in) ;
        double a ,b  ;
        double mAritmetica;
        System.out.print("a este :");
        a=sc.nextDouble();

        System.out.print("b este :");
        b=sc.nextDouble();

        mAritmetica=(a+b)/2 ;
        System.out.println("Media aritmetica este egala cu : "+mAritmetica);




    }

    }
