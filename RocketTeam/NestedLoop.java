import java.util.Scanner;

public class NestedLoop {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

while (true){

    System.out.println("Enter firs number");
    int num1 = scan.nextInt();

    System.out.println("Enter second number");
    int num2 = scan.nextInt();

    System.out.println(num1+num2);

    System.out.println("Would you like to continue ");
    String a = scan.next();

    while( !(a.equals("yes") || a.equals("no"))){

        System.out.println("Invalid Entry, Please re enter");
        a = scan.next();

    }
    if (a.equals("no")){

break;
    }
}



    }
}
