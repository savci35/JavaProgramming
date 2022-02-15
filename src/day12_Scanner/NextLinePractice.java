package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);


        System.out.println("Enter your  age:");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Full Name:");
        String fulName = input.nextLine();

        System.out.println("Enter your GPA:");
        Double gpa = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your School Name:");
        String schoolName = input.nextLine();

        System.out.println("Enter your age = " + age);
        System.out.println("Enter your Full Name = " + fulName);
        System.out.println("Enter your GPA = " + gpa);
        System.out.println("Enter your school Name = " + schoolName);

        input.close();
    }
}
