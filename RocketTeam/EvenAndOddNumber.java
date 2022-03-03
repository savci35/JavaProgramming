import java.util.Scanner;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      while (true){
          System.out.println("Enter a number");
          int num = scan.nextInt();

          if (num%2==0){
              System.out.println("Even Number");
          }else {
              System.out.println("Odd Number");
          }

          System.out.println("would you like to enter re number");
          String a = scan.next();

          while (!(a.equals("yes")||a.equals("no"))){

              System.out.println("Invalid entry, Please would you like to enter re entry");
              a = scan.next().toLowerCase();
          }
          if (a.equals("no")){
              break;
          }
      }

    }
}
