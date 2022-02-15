package day07_Operatores;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 =9;
        int num2 =3;

                int division = num1/num2; // division variable contains the result of num1 divided by num2
        int remainder = num1%num2; // division variable contains remainder of num1 divided by num2

// 10 divided by 3 is equal to 3 with remainder of 1

        System.out.println(num1+" divided by " +num2+ " is equal to " + division + " with remainder of "+remainder);
        /*
        10 % 3==> 1
                                                                   payda
         when you calculate remainder : remainder =numerator -(denominator * integer result)
                                                       10    -(3  *  3) = 1
         */


        System.out.println(25 % 4);
    }
}
