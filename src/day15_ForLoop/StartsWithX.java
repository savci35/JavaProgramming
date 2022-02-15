package day15_ForLoop;


import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {
        Scanner inport =new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = inport.next();


     if (word.charAt(0)=='x'){

         word = word.replaceFirst("x","a");


         System.out.println(word);


     }














    }
}
/*
1. Write a program that asks user to enter a word. If the word
        starts with x, replace it with a.
        Input:
        xcodex
        Output:
        acodex

 */