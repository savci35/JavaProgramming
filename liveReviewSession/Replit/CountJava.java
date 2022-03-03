package Replit;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int counter=0;
String sentence="java";
        for (int i = 0; i <=word.length()-sentence.length() ; i++) {
String result = word.substring(i,i+sentence.length());

            if (result.equalsIgnoreCase("java")){

            }
            counter++;
            System.out.println("counter = " + counter);
        }
    }
}
