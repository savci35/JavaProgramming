package Replit;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
      double factorial=1d;

        for (int i = 1; i <=n ; i++) {


            factorial*=i;
        }
        System.out.println("factorial = " + factorial);
    }
}
