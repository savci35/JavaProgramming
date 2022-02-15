package day08_ifStatements;

public class İdentifyNumber {
    public static void main(String[] args) {

int number =200;

boolean isPositive=number>0;// true
boolean isNegative=number<0;//false
boolean isZero=number==0; //false

        System.out.println(number+" is Positive number :"+ isPositive);
        System.out.println(number+" is Negative  number :"+isNegative);
        System.out.println(number+" is Zero number : "+isZero);

   /*
        System.out.println("isPositive = " + isPositive);
        System.out.println("isNegative = " + isNegative); you can print like these
        System.out.println("isZero = " + isZero);
*/

    }
}
/*
1. Create a class called IdentifyNumber, and write a program that
can identify if the given number is positive, or negative or zero.
Ex:
number = 200
output:
        200 is positive number: true
        200 is negative number: false
        200 is zero: false
 */