package day09_Statements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        boolean aIsMedian =a>b && a<c||a>c&&a<b;
        /*
        in order for a to be the median number
           1.if c is the maximum number & b is the minimum number ,than a is median number
           2.if b is the maximum number & c is the minimum number ,than a is median number
         */
        boolean bIsMedian =b>a && b<c||b>c&&b<a;
        /*
        in order for b to be the median number
        1. if c is the maximum number & a is the minimum number , than b is median number
        2. if a is the maximum number & c is the mınımum number , than b is median number

         */
        boolean cIsMedian =c>a && c<b||c>b&&c<a; // or yıu can write like this boolean cMedian = !aIsMedian && !bIsMedian;
        /*   in order for b to be the median number
        1. if a is the maximum number & b is the minimum number , than c is median number
        2. if b is the maximum number & a is the mınımum number , than c is median number
*/
        if (aIsMedian){ //if a is the median number
            System.out.println(a+" is Median number");
        }
        if (bIsMedian){ //if b is the median number
            System.out.println(b+" is Median number");
        }
        if (cIsMedian){ //if c is the median number
            System.out.println(c+" is Median number");
        }
/*
2. Create a class called MedianNumber. write a program that can find
the median number between three DIFFERENT given integers
Ex:
a = 10, b= 15, c = 20;
Output:
15 is the median number
Posibility #1: a could be median number
Posibility #2: b could be median number
Posibility #3: c could be median number
 */

    }
}
