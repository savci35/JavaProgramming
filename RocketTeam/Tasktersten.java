import java.util.Scanner;

public class Tasktersten {
    public static void main(String[] args) {

        String number = "123456";
        String sum = "";

        for (int i = number.length() - 1; i >= 0; i--) {

            sum += number.charAt(i);
        }


        System.out.println(sum);

        System.out.println("-----------------");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("--------------------");

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");

        }
        System.out.println();
        System.out.println("---------------------");

        for (int i = 100; i >= 0; i--) {

            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("------------------------");
        int i = 20;

        while (0 <= i) {
            i++;
            System.out.print(i + " ");
            if (i == 100) {

                break;
            }
        }
        System.out.println();
        System.out.println("----------------------------");

        String str = "123456789";
        String reserved = "";

        for (int j = str.length() - 1; j >= 0; j--) {

            reserved += str.charAt(j);

        }
        System.out.println(reserved);

        System.out.println("-------------------------------------");


    }
}
