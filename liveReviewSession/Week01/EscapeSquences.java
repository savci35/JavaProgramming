package Week01;

import java.util.Scanner;

public class EscapeSquences {

    public static void main(String[] args) {
/*
        for (int i = 0; i < 1000; i+=10) {
            System.out.print(i+" ");

*/


        for (int i = 0; i <= 1000; i += 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        //==================================
        // initialization
        int z = 0;
        for (; z <= 1000; ) {
            if (z % 10 == 0) {
                System.out.print(z + " ");
            }
            z++;
            // z+=10;  // iteration
        }
            //======================================================

                           /*

         * Question-2:

         Write a program that
         displays all odd numbers between 3-130
         in the same line
         */


            for (int i = 3; i <= 130; i += 2) {
                System.out.print(i + " ");



        }

            int count = 5;
            for (int y = 5; y <= 50; y++) {
                if (y % 2 == 0) {
                    count++;
                }
            }
            System.out.print(count);


    }


}






