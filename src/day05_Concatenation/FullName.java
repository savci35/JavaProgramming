package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String fisrtName = "Savaş";
        String lastName = "ALTUN";
        int age = 45;
String jobTitle = "SDET";
String companyName = "Aple Inc";
double salary = 500000.52;
        String fullName = fisrtName + " " + lastName;

         // Full name of the person is ________
        System.out.println(" Full name of the person is  " + fullName);

        // ____ is___years old
        System.out.println(fullName +  " is " + age + " years old");

        // FullName is JobTitle, works at CompanyName' FullName, and salary is salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName+ "' "+ fullName +",and salary is $" + salary);

    }
}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1.firstName
2.lastName
3. Use concatenation to print the full address
 */