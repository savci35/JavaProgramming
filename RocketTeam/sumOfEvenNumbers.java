import java.util.Scanner;

public class sumOfEvenNumbers {

    public static void main(String[] args) {
/*
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number ");
        int number=scan.nextInt();
        int sum=0;

        while (0<number){

            sum+=number;
            System.out.println("Enter a number ");
            number=scan.nextInt();

        }

        System.out.println("sum = " + sum);

scan.close();
*/

int i=0;
int n=4;
int sum=0;
do {

    i++;
    sum+=i;
}while (i<n);
        System.out.println(sum);
    }
}
