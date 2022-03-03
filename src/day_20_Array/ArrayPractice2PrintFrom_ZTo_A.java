package day_20_Array;

import java.util.Arrays;

public class ArrayPractice2PrintFrom_ZTo_A {
    public static void main(String[] args) {

        char[] letters = new char[26]; // Z~A
/*
        i   ch
letters[0]='Z';//90 asci
letters[1]='Y'; //89
letters[2]='x'; //88

        char ch='Z';

        for (int i =0; i <letters.length ; i++) {

            letters[i]=ch;
            ch--;

        }

        System.out.println(Arrays.toString(letters)); //print the whole array
       // System.out.println(letters[0]); // printing the element of array

        System.out.println("-------------------------------");

             // the other way

        char ch1 ='Z';
        for (int i =0; i <letters.length ; i++,ch1--) {

            letters[i]=ch1;


        }
        System.out.println(Arrays.toString(letters));

 */

        for (char i = 0,j='Z'; i <letters.length ; i++,j--) {
            letters[i]=j;

        }
        System.out.println(Arrays.toString(letters));

    }


}
