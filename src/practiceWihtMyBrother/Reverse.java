package practiceWihtMyBrother;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence= scan.nextLine();
String result="";


        for (int i = sentence.length()-1; i>=0; i--) {

          char ch= sentence.charAt(i);

          result+=ch;

        }
        System.out.println("result = " + result);
    }
}
