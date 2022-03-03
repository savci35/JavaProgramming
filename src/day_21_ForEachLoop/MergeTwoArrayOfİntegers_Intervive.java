package day_21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArrayOfİntegers_Intervive {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};

        int[] merge=new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(merge));// [0, 0, 0, 0, 0, 0]bunu ölesine yazdım ikisinin sığacağı bir array olmuşmu die

        System.arraycopy(arr1, 0, merge, 0, arr1.length);
        System.arraycopy(arr2, 0, merge, arr1.length, arr2.length);

        System.out.println(Arrays.toString(merge));


    }
}
/*
1. write a program that can merge two arrays of integers
Ex:
arr1 = {1,2,3,4}
arr2 = {5,6}
output
arr3 = {1,2,3,4,5,6}
 */