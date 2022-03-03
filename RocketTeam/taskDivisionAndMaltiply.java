import java.util.Scanner;

public class taskDivisionAndMaltiply {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        int num1= scan.nextInt();
        System.out.println("Enter second number");
        int num2= scan.nextInt();
        /*


int counter=0;
//   15/3  15-3 12-3 9-3 6-3 3-3
        while(num1>=num2){

          num1-=num2;
          counter++;
        }
        System.out.println(counter);
        System.out.println(num1);
*/

int sum=0;
//             3*5  ya 5+5+5 yada 3+3+3+3+3
        while (0<num1){

            sum+=num2;
            num1--;
            System.out.println(sum); //her defasında sum yazar
        }




    }
}
/*
Write a program that can divide two positive numbers
without using / (division) and * (multiplication) operators.
 */