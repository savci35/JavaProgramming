package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {

int firstNumber = 100;
int secondNumber = 50;
/*
int additional = firstNumber + secondNumber;
int subtraction = firstNumber - secondNumber;
int multiply = firstNumber * secondNumber;
*/

// 100 + 50 = 15
        System.out.println(firstNumber +"+"+ secondNumber + "="+ (firstNumber + secondNumber) );
                                                                        // you can write additional insted of (firstNumber + secondNumber)
// 100 * 50 = 5000
        System.out.println(firstNumber +"*"+ secondNumber +"="+ (firstNumber * secondNumber));
                                                                       // you can write subtraction insted of (firstNumber - secondNumber)

// 100 - 50 = 50
        System.out.println(firstNumber+"-"+ secondNumber+ "=" + (firstNumber - secondNumber));
                                                                       // you can write multiply insted of (firstNumber * secondNumber)


    }
}
