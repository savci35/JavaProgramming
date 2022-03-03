package day_20_Array;

import java.util.Arrays;

public class ArrayPractice2PrintFrom_ATo_Z {

    public static void main(String[] args) {
        char[] letters = new char[26];
       /*
        letters[0]='A';
        letters[1]='B';
        letters[2]='C';
        */

        for (char i ='A',j=0; i <='Z'&&j<letters.length ; i++,j++) {

            letters[j]=i;


        }
        System.out.println(Arrays.toString(letters)); //[A~Z]

        System.out.println("---------------------------------------");
        
        /*
        letters[0]='A';
        letters[1]='B';
        letters[2]='C';
        */
        
        
       // the other way to write letters
//                 her char ın bir numarası var
        for (int i = 0,j='A'; i <letters.length ; i++,j++) {  // i:index numbers 0 ~ last index

            letters[i]=(char) j;

        }
        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("-----------------------------------");
        
        //the other way to write letters

        char ch='A';

        for (int i = 0; i <letters.length ; i++) {
            letters[i]=ch++;
            
        }
        System.out.println(Arrays.toString(letters));//[A~Z]

        System.out.println("-----------------------------------");

                                //the other way of writing letter
         char ch2='A';

        for (int i = 0; i <letters.length ; i++,ch2++) {

            letters[i]=ch2;

        }
        System.out.println(Arrays.toString(letters));//[A~Z]


        System.out.println("-----------------------------------");

        //the other way of writing letter
        char ch3='A';

        for (int i = 0; i <letters.length ; i++) {

            letters[i]=ch3;
            ch3++;
        }
        System.out.println(Arrays.toString(letters));//[A~Z]
    }

    
    
    
}
