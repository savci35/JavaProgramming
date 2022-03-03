package Replit;

import java.util.Scanner;

public class OscarTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.println("Enter a number");
        int num = scan.nextInt();

        for (int i = 1; i <=num; i++) {

        total+=i;

        }
        System.out.println(total);


        System.out.println("=====================================");


    }
}
/*
        *
        * Question-8:

        Write a program to calculate the sum of the numbers from 1 till upper bound.
        If upper bound is 5, sum should be 1 + 2 + 3 + 4 + 5 = 15.
        If upper bound is 11, sum should be 1 + 2 + ... + 11 = 66.
        If upper bound is 100, sum should be 1 + 2 + ... + 100 = 5050.

        */