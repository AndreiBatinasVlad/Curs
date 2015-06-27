package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Introduceti un numar");

        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean isNumber;

         do {
             try {
                 scan = new Scanner(System.in);
                 number = scan.nextInt();
                 isNumber = true;
                 if((number < 0) || (number % 2 != 0)){
                     System.out.println("Introdu un numar impar sau un numar pozitiv");
                     isNumber = false;
                 }

             } catch (Exception e) {
                 System.out.println("Introdu unj numar valid:");
                 System.out.println("sadasda");
                  isNumber = false;

             }

         }while(!isNumber);

        System.out.println("Numarul este: " + number);
    }
}
