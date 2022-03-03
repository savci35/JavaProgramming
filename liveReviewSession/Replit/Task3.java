package Replit;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {


        String str = "Java Programming";
        String ascii = " - ASCII Character No: ";
        String character = " -Character: ";
        String index = "Index No: ";

        for (int i = 0; i < str.length(); i++) {


            System.out.println(index + i + character + str.charAt(i) + ascii + str.codePointAt(i));

        }

        System.out.println("Program terminated");

        System.out.println("-----------------------------------------");


        for (int i = 0; i <= 9; i++) {

            System.out.print(i);

        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int i = 9; i >= 0; i--) {

            System.out.print(i);

        }
        System.out.println();
        System.out.println("------------------------------------------");


        for (int i = 5; i<=10; i++){

            System.out.print(i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int i = 4; i <=100 ; i+=7) {

            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for (int i=100; i>=5; i-=3){
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("------------------------------------------");


        for(int i=1; i<=5; i++) {
            System.out.println("Karekök içinde "+i*i+" = "+i+" demektir.");
        }

        System.out.println();
        System.out.println("------------------------------------------");
            System.out.println("<------>");
        for (int i = 0; i <4 ; i++) {

            System.out.println("+      +");
            System.out.println("   +   ");
        }
            System.out.println("<------>");
/*
<------>
+      +
   +
+      +
   +
+      +
   +
+      +
   +
<------>

 */

        System.out.println("---------------------------");
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");
        int inhabitants= scan.nextInt();



            for (int i = 0; i < inhabitants; i++) {

                inhabitants /= 2;

                System.out.println(inhabitants);
            }

        System.out.println("------------------------------------");

        while (inhabitants>0){

            inhabitants/=2;

            System.out.println(inhabitants);

        }




        }




    }




