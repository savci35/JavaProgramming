package day_21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers={10, 20, 30, 40, 50};
//index                0    1   2  3   4
        int[] reserved=new int[numbers.length];//to make sure that the array has enough capacity to contain all the elements of first array
     //   System.out.println(Arrays.toString(reserved)); //[0, 0, 0, 0, 0] üstteki satırı reverse edeeğimiz kadar geniş tuttuk yazdırınca onunla aynı genişlikte olduğunu gördük bunu sadece test için yazdırdım
/*
        reserved[0]=numbers[3];
        reserved[1]=numbers[2];
        reserved[2]=numbers[1];
        reserved[3]=numbers[0];


        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            reserved[j]=numbers[i];
        }
*/

        System.out.println(Arrays.toString(reserved));

       //             the other way of doing

        int counter=0;

        for (int i = numbers.length-1; i >=0 ; i--) {

            reserved[counter]=numbers[i];
            counter+=1;
        }

    }
}
