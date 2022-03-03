package day_20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("How many numbers Would you like to enter?");
        int length = scan.nextInt();

        if (length<=0){
            System.out.println("Invalid Number");
            System.exit(0);

        }
        int[] numbers=new int[length]; // array needs to have enough capacity to contain all the elements user going to enter

        for (int i = 0; i <length ; i++) {

            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();        // each input user provided duringeach execution of the loop,will be assigned to the indexes of th array

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();


    }
}
