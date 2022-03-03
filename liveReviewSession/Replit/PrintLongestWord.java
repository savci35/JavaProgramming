package Replit;

import java.util.Scanner;

public class PrintLongestWord {




            public static void main(String[] args) {
                //DO NOT CHANGE
                Scanner scan = new Scanner(System.in);
                String word1 = scan.next();
                String word2 = scan.next();
                //WIRTE YOUR CODE HERE

                int x = word1.length();
                int y = word2. length();

                if(x>y){
                    System.out.println("Longest Word: "+word1);

                }else{
                    System.out.println("Longest Word: "+word2);
                }

            }
        }

/*
Write a program that will print out the longest word. Note: Assume the length of the two given Strings will be different

input:
bill
check
input:
bill
check
output: check
 */
