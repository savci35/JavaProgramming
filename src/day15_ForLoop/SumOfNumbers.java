package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        double sum =0;                                                               // if you assigne as int , output 5050
//1+2+3+4+5+........

        for (int i = 1; i <101 ; i++) { //i:1,2,3,4,5,6,7,8,9...........100

            sum +=i;

        }

        System.out.println(sum);

        System.out.println("---------------------------------");



        Scanner scan = new Scanner(System.in);


        int total = 0;

        for (int i = 0; i <5 ; i++) {

            System.out.println("Enter a number");
            total += scan.nextInt();


        }
        System.out.println("total = " + total); /* eğer bu kısmı loop un içine koyar isem  her seferinde bir önceki sayı ile toplar
         toplanan sayıyıda bize verir, yazmaz isen beş sayıyı girdikten sonra tek toplam verir

                                                                                                            */

        scan.close();
    }





}
