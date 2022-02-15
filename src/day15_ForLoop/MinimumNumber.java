package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int min =2147483647;
     //   int min1 = Integer.MAX_VALUE;

        for(int i=0; i<5; i++){

            System.out.println("Enter a number:");
            int num = scan.nextInt();            //67,23,42,5,-10
                                                                  /*
                                                                  1. numara        67<2147483647     mü  kücük oldugu için yeni numaram bir sonraki satır 67
                                                                  2. numara        23<67   mü       doğru kücük olduğu için  numaram bir sonraki satır 23
                                                                  3. numara         42<23   mü      yalnış hala küçük numaram 23
                                                                  4. numara        5<23    mü      doğru  küçük olduğu için numaram bir sonraki satır 5
                                                                  5. numaram       -10<5   mü      doğru  küçük ve en küçük numaram son satırda     -10 olmuş oldu


                                                                  bu şekilde başka beş  numara girip çalıştırılabilir


                                                                   */
            if( num<min){
                min=num;
            }
        }

        System.out.println("min = " + min);


    }
}
/*
Write a program that asks the user to enter a number for 5 times.

return the minumum number

 */