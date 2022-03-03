package Replit;

import java.util.Scanner;

public class FrecuencyHi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str = scan.nextLine();

        int countHi =0;

        for (int i = 0; i <str.length()-1 ; i++) {

            String ch =str.substring(i,i+2);

            if (ch.equals("hi")){
                countHi++;
            }

        }
        System.out.println("countHi= "+countHi);

    }
}
