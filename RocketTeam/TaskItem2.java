import java.util.Scanner;

public class TaskItem2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String[] items=new String[5];
        double[] prices=new double[5];

double totalPrice=0;

        for (int i = 0; i <items.length ; i++) {
            System.out.println("Enter "+i+1+" item name");
            items[i]=scan.next();
            System.out.println("Enter "+i+1+ " price");
            prices[i]=scan.nextDouble();
            totalPrice+=prices[i];

        }

        for (int i = 0; i <items.length ; i++) {

            System.out.println(items[i]+" --- "+prices[i]);

        }
        System.out.println("totalPrice = " + totalPrice);

    }
}
