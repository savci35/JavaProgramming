package Replit;

public class Task2 {
    public static void main(String[] args) {

        String str = "Java Programming";
String result="";

        for (int i = str.length()-1; i>=0;i--){
          result += str.charAt(i);
        }
        System.out.println(result);




    }

}