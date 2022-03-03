package Replit;

import java.util.Scanner;

public class PrintLastAndLastLetter {


        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
            // First character of a string


            char first = word.charAt(0);

            // Last character of a string
            char last = word.charAt(word.length()-1);

            System.out.print(first);
            System.out.print(last);
        }
    }

/*
Write a program that will print out first and last letters together.

Input: adobe
Input: adobe
Output: ae
 */