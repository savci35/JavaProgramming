package day06_PrimitiveTypeCasting;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println(12+ "1" ); //121 , concatenation
        System.out.println(100 + 50); // 150 , Additional
        System.out.println( 100 - 50); // 50 , Subtract
        System.out.println( 100 * 2); // 200 , Multiplication
        System.out.println( 100 / 50); // 2 , Division


        System.out.println( 100 / 3); // 33
        System.out.println( 10.0 / 4); // 2.5
        System.out.println(10 / 4.0);  //2.5
        System.out.println( 10d / 4);  // 2.5 // be careful this line

        int  a = 100;
        double b = a/6;    // 16.0
        System.out.println(b);

        double c = a/6.0; // or you can write like  double c = a/6d;   //16.66666666 an other way  double c =( double)// a/6; result =16.66666666
        System.out.println(c);

    }
}
/*
+ = Addition
- = Subtract
* = Multiplication
/ = Division
                    integer / integer ======> integer
                    decimal / integer ======> decimal
                    integer / decimal ======> decimal
                    decimal / decimal ======> decimal




             in math:
                  10 / 4 = 2.5
             in java:
                   10 / 4 = 2   // because 10 / 4 = integer number because of this result is  "integer "=2

                   10.0 / 4 = 2.5  //  because 10 / 4 = double number because of this result is  "double "=2.5
                   100 / 3 = 33
% = Remainder
 */