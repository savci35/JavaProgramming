import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();
        System.out.println("Enter a operator ");

        char operator = scan.next().charAt(0);

        switch (operator) {

            case ('+'):
                System.out.println(num1 + num2);
                break;
            case ('-'):
                System.out.println(num1 - num2);
                break;
            case ('*'):
                System.out.println(num1 * num2);
                break;

            default:
                System.out.println(num1 / num2);

        }
scan.close();

    }
}
/*
create calculator using switch case

Input:
5.2 - 3
Output:
2.2
 */