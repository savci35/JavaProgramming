package day_21_ForEachLoop;

import java.util.Arrays;

public class DescendinOrderMuhtarTask {

    public static void main(String[] args) {

        int[] numbers={20,10,3,40,50,459,78,13};

        Arrays.sort(numbers);                       //[3, 10, 13, 20, 40, 50, 78, 459]
        System.out.println(Arrays.toString(numbers));

        /*
        1. Write a program that sort the array of integer in descending
order
         */

        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]%2==0){

                System.out.println(numbers[i]+"= "+"Even number");

            }else {
                System.out.println(numbers[i]+"= "+"Odd number");
            }


        }
/*
2. Write a program that can count the even and odd number from an
array of integers
 */

        System.out.println("---------------------------------------------");

int[]   arr1= {1,2,3,4,5};
int[]   arr2= {4,5,6,7,8};











        /*
        Note: MUST use for each loop
3. Write a program that can print out the common elements from two
integer array
Ex:
arr1: {1,2,3,4,5}
arr2: {4,5,6,7,8}
output:
4 5
         */
    }

}
