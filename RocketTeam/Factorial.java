import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number:");
       int number=scan.nextInt();
       int factorial=1;

        for (int i = 1; i <=number ; i++) {

            factorial*=i;

        }
        System.out.println(number+" ! "+" = " + factorial);

    }
}
// 5!=5*4*3*2*1=120