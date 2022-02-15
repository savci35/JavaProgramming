package Quiz;

import java.util.Scanner;

public class Quiz_ifStatements {
    public static void main(String[] args) {
         char grade ='A';

         boolean Passed = grade=='A' || grade=='B';
         //                 true   ||   false : true
         boolean Passed2 =grade=='C' || grade=='D';
         //               false     || false  :false
         //    true  || false : true
         if (Passed ||Passed2){
             System.out.println("You've passed the exam");
         }else System.out.println("You failed");

        System.out.println("---------------------------------------------------------");

        boolean A = true, B = !false;

        if (B){
            System.out.println("B");
        }else if(A){
            System.out.println("A");
        }else{
            System.out.println("C");
        }
        System.out.println("---------------------------------------------------------------");
/*
        boolean result = true;

        if (result){                                                         // you can not write this code you can write it like if and else if ater than else
            System.out.println("it's true");
        }else {
        System.out.println("it's false");
        }else if (result){
            System.out.println("None of the above");
        }
*/
        System.out.println("-------------------------------------------------------------------");

        int number =10;
        if (--number>10){
            System.out.println("Hello Cybertek "+number);
        }else if (number==9){
            System.out.println("Hello World "+number);
        }
        System.out.println("---------------------------------------------------------------------");

        boolean X = true;
        boolean Y =!X==false;
        boolean Z = Y;

        if (X){
            System.out.println("Hello World");
        }
        if (Y){
            System.out.println("Today is great day");
        }
        if (Z){
            System.out.println("We are improving everyday");
        }
        System.out.println("------------------------------------------------------------------------");

        int x =10;
        int y =x++;

        System.out.println(y++ +" "+ x++ +" "+ y);

        System.out.println("--------------------------------------------------");


        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num1 =input.nextInt();

        System.out.println("Enter a  decimal number:");
        double num2 =input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+(num1*num2));




        /*
        --------------------------------------------------
Enter an integer:
5
Enter a  decimal number:
2,6
5
2.6
Multiplication: 13.0

         */

    }
}
