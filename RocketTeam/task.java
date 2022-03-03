import java.util.Scanner;

public class task {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String key = scan.next();
        int ans = key.equalsIgnoreCase("yes") ? 1 : 0;

        if (ans == 1) {
            System.out.println("1 2 3");
            int a = scan.nextInt();
            switch (a) {
                case 1:
                    for (char i = 'A'; i <= 'Z'; i++) {
                        System.out.println(i);

                    }
                    break;
                case 2:
                    for (char i = 'a'; i <= 'z'; i++) {
                        System.out.println(i);


                    }
                    break;
                case 3:
                    for (int i = 0; i <= 10; i++) {
                        System.out.println(i);

                    }
                    break;
            }
        } else {
            System.exit(0);
        }
    }
}