package day3_EscapeSequences;

public class AboutMe {


    public static void main(String[] args) {

        System.out.println("My favorite music is \"jaz\"");
        System.out.println("\tmy favorite book is twilight\n\tmy favorite book is \"Database\"in java");
        System.out.println("My favorite  quote is bla bla");
        System.out.println("My favorite TV show is \nwhite show");


        int number = 100;
        if (number >= 0 && number <= 100) {
            System.out.println("Valid number");


            if (number >= 50 && number <= 75) {
                System.out.println("iyi");
            }
            if (number >75 && number <= 100){
                System.out.println("çok iyi");


        }  else {
                System.out.println("failed");

            }

        } else {
            System.out.println("Invalid number");
        }
    }
}