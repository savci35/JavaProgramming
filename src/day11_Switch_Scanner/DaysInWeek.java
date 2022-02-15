package day11_Switch_Scanner;
                                                                     /*
                                                                   Case value MUST match with switch' data type and UNIQUE

Switch' Data can not be long, float, double and boolean data types

break: used for exiting the switch.

if we don't give the break statement, switch
statement continue to execute the next block(s) until the break statement
or } of the switch

default block gets executed if none of the case blocks matched.
there can only be one default block

or logic we can use it in switch by declaring case blocks back to
back

                                                                      */

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 7;

        switch (number) {//1,2,3,4,5,6,7

            case 1:
                System.out.println("Monday");
                break; // exists the switch after executing the case block


            case 2:
                System.out.println("Tuesday");
                break;// exists the switch after executing the case block

            case 3:
                System.out.println("Wednesday");
                break;// exists the switch after executing the case block


            case 4:
                System.out.println("Thursday");
                break;// exists the switch after executing the case block


            case 5:
                System.out.println("Friday");
                break; // exists the switch after executing the case block

            case 6:
                System.out.println("Saturday");
                break;// exists the switch after executing the case block

            case 7:
                System.out.println("Sunday");
                break;// exists the switch after executing the case block

            default:
                System.out.println("Invalid");
                break;





        }

    }
}


