package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        System.out.println("---------------------------------------------");

        String result1 = (n % 2 == 0) ? "Even" : "Odd";       // this code is the same at below
        System.out.println(result1);


        System.out.println("--------------------------------------------------------------------------------------------");
        int age = 20;

        if (age >= 21) {
            System.out.println("eligible to buy alcohol");
        } else {
            System.out.println("not eligible to buy alcohol");
        }
        System.out.println("---------------------------------------------");

        //System.out.println((age>=21)? "eligible to buy alcohol" : "not eligible to buy alcohol"); you can write it like below

        String result2 = (age >= 21) ? "eligible to buy alcohol" : "not eligible to buy alcohol";
        System.out.println(result2);

        System.out.println("---------------------------------------------------------------------------------------------");

        int number = 100;

        if (number < 0) {
            System.out.println("Negative");
        } else if (number > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }
        System.out.println("-----------------------------------------------");
        String result3 = (age > 0) ? "Positive" : (age < 0) ? "Negative" : "Zero";

        System.out.println(result3);
    }
}