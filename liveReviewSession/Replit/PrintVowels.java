package Replit;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = scan.nextLine();
        String result="";


        for (int i = 0; i <word.length() ; i++) {

              String ch=""+word.charAt(i);

              if( !(ch.equalsIgnoreCase("a")||ch.equalsIgnoreCase("e")||ch.equalsIgnoreCase("o")||ch.equalsIgnoreCase("u")||ch.equalsIgnoreCase("i"))){

                  continue;

              }
            System.out.print(ch+" ");
        }

        /*
        Create a program that will take the given String In and print out all the vowels from the String.

Example:

Input: howdyho

Output: oo
Input: howdyho

Output: oo
Input: huehuehuehue

Output: ueueueue
         */
    }
}
