package day06_PrimitiveTypeCasting;

public class BirthDay {
    public static void main(String[] args) {

        String name = "Savaş";
        int birthDay = 1;
        String birthMounts = "December";
        int year = 1989;

        System.out.println( name+" was born on "+ birthMounts +"/"+birthDay+"/"+year+".");
        System.out.println("-------------------------------------------------");
        // My favorite book is "bookName"
String bookName = "java";

        System.out.println("My favorite book is \""+bookName+"\"");
    }
}
/*
1. Create a class named BirthDay and create the following variable
 name, birthDay(int), birthMonth(String),
birthYear(int)
 use concatenation to display the birthday of
the person
 if  name = "John"
 birthDay = 25
     birthMonth = "April"
     birthYear = 1995;
 output:
 John was born on April/25/1995.
 */