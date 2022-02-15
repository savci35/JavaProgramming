package tasks;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        System.out.println("Enter a Name:");
        String name= input.next();

        System.out.println("Enter a Lastname:");
        String Lastname= input.next();

        System.out.println("Enter an Age:");
        int age =input.nextInt();

        System.out.println("Enter an ID:");
        long Id =input.nextLong();

        input.nextLine();

        System.out.println("Enter a gender:");
        String gender= input.next();


        System.out.println("Enter an Salary:");
        Double salary =input.nextDouble();
        input.nextLine();
        System.out.println("Mother's name:");
        String nameOfMother=input.next();

        System.out.println("Father's name:");
        String nameOfFather=input.next();
        System.out.println("married:");
        boolean isMarried = input.hasNextBoolean();


        System.out.println("Name:"+name);
        System.out.println("Lastname:"+Lastname);
        System.out.println("Age:"+age);
        System.out.println("Id:"+Id);
        System.out.println("gender:"+gender);
        System.out.println("Mother's name:"+nameOfMother);
        System.out.println("Father's name:"+nameOfFather);
        System.out.println("married:"+isMarried);

    }
}
