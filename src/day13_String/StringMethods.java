package day13_String;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

  //charAt(index): returns the character at the given index,returns char



        String word = "Cydeo";
//                     01234
        char thirdChar = word.charAt(4);



        System.out.println("thirdChar = "+thirdChar);


        System.out.println("------------------------------------------");

        //length(): returns the total number of characters. returns int


        String s1 = "Batch is the best batch.";

        int totalChars = s1. length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);

        System.out.println("lastChar = "+lastChar);
        System.out.println("--------------------------------------------------");

        String str = "wooden spoon";

        str = str.toUpperCase();
        System.out.println(str);

        System.out.println("------------------------------");
        String sentence = "JAVA";

        sentence = sentence.toLowerCase();
        System.out.println(sentence);


    }
}
