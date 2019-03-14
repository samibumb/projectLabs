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

    /*ex13*/interval(8);
    /*ex7*/inversul(789,0);
    /*ex8*/palindrom(3553,0,0);
    /*ex11*/sumaInt(123,0);
    /*ex4*/tablaInmultirii(0,0,0);


    }
    //Exercitiul 13

    public static void interval(int x) {

        if (x > 4 && x < 15) {
            System.out.println(x + " apartine intervalului [4,15]");

        } else {
            System.out.println(x + " este in afara intervalului [4,15]");
        }
    }

        //ex 7

    public static void inversul(int x , int inv ){

        while(x!=0) {
            inv = inv * 10 + x % 10;
            x=x/10 ;

        }
            System.out.println("inversul numarului este : "+inv);
    }

   //Exercitiul 8

    public static void palindrom(int x , int invers , int palindrom){
        palindrom=x ;
        while(x!=0){
            invers=invers*10+x%10 ;
            x=x/10 ;
        }
        if(invers==palindrom){
            System.out.println("numarul este un palindrom");
        }else{
            System.out.println("numarul nu este un palindrom");
        }
    }

    //Exercitiul 11

    public static void sumaInt(int x,int sum) {

        //suma nr unui numar
        while (x!=0){
            sum=sum+x%10;
            x=x/10;
        }
        System.out.println("Suma este : " +sum);

    }

    //Exercitiul 4

    public static void tablaInmultirii(int x , int i , int tabla){

        Scanner scanner = new Scanner(System.in);
        System.out.print("x : ");
        x=scanner.nextInt();

        for(i=0;i<=10;i++){

            tabla=i*x ;
            System.out.println(i+"*"+x+"="+tabla);
        }



    }

}



