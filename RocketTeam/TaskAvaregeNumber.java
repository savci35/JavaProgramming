import java.util.Scanner;

public class TaskAvaregeNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How many of numbers would you like to enter");
        int num = scan.nextInt();
        int[] numbers=new int[num];




   int sum=0;

        for (int i = 0; i <num; i++) {
            System.out.println("Enter a number");
            numbers[i] = scan.nextInt();
            sum+=numbers[i];
        }

        double avarege=sum/num;

        System.out.println(avarege);

    }


}
