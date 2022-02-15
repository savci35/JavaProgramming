package day09_Statements;

public class PosNegZero {
    public static void main(String[] args) {

        int number = 20;
/*
 if (number>0){
            System.out.println(number+" is positive ");}
             if (number<0){
            System.out.println(number+" is Negative ");}
             if (number==0){
            System.out.println(number+" is Zero ");}

*/
        System.out.println("--------------------------------------------------");


        boolean isPositive = number>0;
        boolean isNegative = number<0;
        boolean isZero =number==0;


        if (isPositive){
            System.out.println(number+" is positive ");
        }else if (isNegative) {
            System.out.println(number + " is negative");
        }else {
            System.out.println(number+" is zero");}

// if & else statement we can NEVER apply for tasks that requires mor than two conditions!!! you have to use multi- branch if statement
    }
}
