package day_19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

      while (true){

          System.out.println("Enter a number");
          int num= scan.nextInt();


          if (num%2==0){
              System.out.println("Even Number");
          }else {
              System.out.println("Odd Number");
          }

          System.out.println("Would you like to enter another number ? ( yes or no)");
          String answer=scan.next();

          if (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
              System.out.println("Invalid Entry");                                                                                            // sonlandırmak
              System.exit(0);                                          // when you write something accept yes or no  System.exit(0); which terminates the program

          }


          if (answer.equals("no")){
              System.out.println("Thank you !");
break;
          }



      }



    }
}
