package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();



        System.out.println("Enter your Programming Language:");
        String programming= input.nextLine();  // reads everything

        System.out.println("Enter your age:");
        int age = input.nextInt();

        input.nextLine();                                 //  you have to write   input.nextLine(); after tahan int age = input.nextInt();   it can be readible      System.out.println("Enter your school name:");

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();


        System.out.println("FullName = "+fullName);
        System.out.println("programming = "+programming);
        System.out.println("your age = "+age);
        System.out.println("your school name = "+schoolName);

input.close();
    }
}
/*
1-Enter your full name:
2-Enter your Programming Language:
3-Enter your age
4-Enter your school name:
 */