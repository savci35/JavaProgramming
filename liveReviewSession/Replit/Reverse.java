package Replit;

import java.util.Scanner;

public class Reverse {



            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String word = scan.next();
                //WRITE YOUR CODE HERE


                if(word.length()>5){
                    System.out.println("Too long!");
                }else if(word.length()<5)
                {System.out.println("Too short!");
                }else{
                    System.out.print(word.charAt(4));
                    System.out.print(word.charAt(3));
                    System.out.print(word.charAt(2));
                    System.out.print(word.charAt(1));
                    System.out.print(word.charAt(0));


                }


            }
        }


/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console.

Example:

input: cat

output: Too short!
input: cat

output: Too short!
input: singularity

output: Too long!
input: singularity

output: Too long!
input: apple

output: elppa
 */