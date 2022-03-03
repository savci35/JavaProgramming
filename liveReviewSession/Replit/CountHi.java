package Replit;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scan.nextLine();
/*
        int result = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            String ch = str.substring(i, i + 2);

            if (ch.equals("hi")) {
                result++;
            }

        }
        System.out.println(result);


        int i=0;
        int result=0;
        while ( i<str.length()-3)  {

      String ch =   str.substring(i,i+4);
            System.out.println(ch);
            i++;

            if (ch.equals("java")){
                result++;
            }
        }

        System.out.println(result);
*/

        int counter=0;
        int i=0;
        while ( str.contains("hi"))
        {
            str = str.replaceFirst("hi", "");
            counter++;
        }

        System.out.println(counter);


    }
}




/*
Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the word");
        String str= scan.next();
        int num=0;
        while ( str.contains("hi")) ; {
                                 num++;
            }

            System.out.println(num);
 */
/*
Print out the number of times that the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.

Example:

input: abc hi how hi

output: 2
input: abc hi how hi

output: 2
Example:

input: hi code java please

output: 1
 */