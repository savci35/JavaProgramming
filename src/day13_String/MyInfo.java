package day13_String;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();


        System.out.println("Enter your gender:");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        Long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state name:");
        String stateName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.nextLine();


        System.out.println("enter your street name:");
        String streetName = input.nextLine();

        System.out.println("Full name =" + fullName);
        System.out.println("Age =" + age);
        System.out.println("Gender =" + gender);
        System.out.println("Phone number =" +phoneNumber);
        System.out.println("Address:\n\t"+buildingNumber+" "+streetName+"\n\t"+cityName+", "+" "+stateName+" "+zipCode);
        System.out.println(" Enter your School name =" + schoolName);
        input.close();
    }


}
/*
1. Create a class called MyInfo. Write a program that can ask the
user to:
1. Enter your age (int)                                                  you can use  nextInt()
2. Enter your gender (String- One word ONLY)                            you can use  next()
3. Enter your full name (String- Multiple words)                      you can use  nextLine()
4. Enter your phone number (long)                                    you can use  nextLong()
5. Enter your zip code (int)                                         you can use  nextInt()
6. Enter your School name (String- Can be Multiple words)           you can use  nextLine()
7. Enter your city name (String- Can be Multiple words)             you can use  nextLine()
8. Enter your state name (String- One word ONLY)                     you can use  next()
9. Enter your building number (int)                                   you can use  nextInt()
10. Enter your Street name                                        you can use  nextInt() or  you can use  next()


MAKE SURE USER CAN ENTER ALL THE INPUT


Display all the inputs that user entered in following
order in sperate lines:
1. full name
2. age
3. gender
4. phone number
5. address:
buildingNumber
Street
City, State
ZipCode
6. school name
 */