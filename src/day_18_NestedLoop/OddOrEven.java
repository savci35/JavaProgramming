package day_18_NestedLoop;

import java.util.Locale;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true){
            System.out.println("Enter a number");
            int number= scan.nextInt();
            ;

            if (number%2==0){
                System.out.println(number+" is even Number");
            }else {
                System.out.println(number+" is odd Number");
            }

            System.out.println( "Would you like to enter another number");
            String answer= scan.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){  // if the answer invalid ( not yes or no)
                System.err.println("Please re enter,Would you like to enter another number");
                answer= scan.next().toLowerCase();
            }

if (answer.equals("no")){

    break;
}

        }




    }
}
/*
2. Write a program that asks user to enter a numnber , and check if the
number is odd or even.
if it's odd, print "Odd Number"
if it's even, print "Even number"
Ask the user "Would you like to enter another number"
if user enters yes, repeat the previous steps
if user enters no, print nothing
If user enteres invalid answer, repeat the previous steps
 */