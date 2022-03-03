package Replit;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
      String str = scan.nextLine();
String reserved="";

        for (int i = str.length()-1 ; i >=0 ; i--) {
            reserved += str.charAt(i);
        }

if (str.equalsIgnoreCase(reserved)){
    System.out.println(str+" is palindrome");


}else{
    System.out.println(str+"is not palindrome");
}





    }
}
