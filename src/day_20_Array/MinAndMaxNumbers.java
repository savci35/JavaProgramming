package day_20_Array;

import java.util.Scanner;

public class MinAndMaxNumbers {
    public static void main(String[] args) {
Scanner scan =new Scanner(System.in);

        int[] numbers=new int[10];

        for (int i = 0; i < numbers.length; i++) {       //    bu kısımda numaraları girmek için kullandık
            System.out.println("Enter a Number.");
            numbers[i]=scan.nextInt();    // each user entered input will be assigned to the indexes of the array number

        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){
                max=numbers[i];
            }

            if (numbers[i]<min){
                min=numbers[i];

            }

        }
        System.out.println("max number = "+max);
        System.out.println("min number = " + min);
    }
}
