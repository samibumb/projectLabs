package org.fasttrackit.lab3;

import java.util.Scanner;

public class AlteTreiExercitii {
    public static void main(String[] args){

        //ex 2

        Scanner sc = new Scanner(System.in);
       int sum = 0;
        System.out.println("Enter the length of the array:");
        int length = sc.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            myArray[i] = sc.nextInt();
            sum = sum + myArray[i];
        }

        double medie = sum / myArray.length;
        System.out.println("Media este " + medie);

       /*ex 3*/ maxNr();
        /*ex 15*/factorial(1);

    }


        public static void maxNr(){
            Scanner sami = new Scanner(System.in);

            System.out.print("x:");
            int x=sami.nextInt();
            int[] arr=new int[x];
            System.out.println("elements :");

            for (int i = 0; i < x; i++) {
           arr[i] = sami.nextInt();

        }
            int max=arr[0];
            for (int i = 0; i < x; i++){
                if(max<arr[i]){
                    max=arr[i];
                }
            }
            System.out.println("Max value is :"+max);
        }

        public static void factorial(int factorial){
        int a=5;
        for (int i=1;i<=a;i++){
            factorial=factorial*i;
        }
            System.out.println(factorial);
        }
}
