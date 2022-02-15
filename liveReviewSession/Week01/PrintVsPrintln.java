package Week01;

import java.util.Locale;

public class PrintVsPrintln {
    public static void main(String[] args) {
        String word2 = "Java programming Language";
        //              0123456
      String str=  word2.substring(0,word2.indexOf(" "));
     String str2=   word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
String str3 = word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("---------------------------------------------");
word2=word2.toLowerCase();
 String word1=word2.toUpperCase();

        System.out.println("word2 = " + word2);
        System.out.println("word1 = " + word1);
        System.out.println("------------------------------------------------");


        int s1 = word2.length();
        System.out.println("s1 = " + s1);

        System.out.println("-----------------------------------------------");

        word2 =word2.trim();

        System.out.println(word2);

        System.out.println("---------------------------------");

      int s2 =word2.indexOf("p");
        System.out.println("s2 = " + s2);

        int s3 = word2.lastIndexOf("p");
        System.out.println("s3 = " + s3);
        System.out.println("---------------------------------");

        String s4 = word2.substring(word2.indexOf(" p"),word2.lastIndexOf("g")+2);
        System.out.println("s4 = " + s4);
        System.out.println("------------------------------------------");



        String word = "Java programming Language";
        int n1 = word.indexOf("J");
        int n2 = word.indexOf("v")-1;
        int a = n2-n1;
        System.out.println(a);
        System.out.println("-------------------------------------------------------");

        String email ="Cydeo.School@gmail.com"; //gmail

      email= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println(email);
        System.out.println("---------------------------------------");

String ali ="savaş altun";

char s =ali.charAt(4);

        System.out.println("s = " + s);
        System.out.println("----------------------------------------");

        String email2 ="Cydeo.School@gmail.com";

        int beginningIndex = email2.indexOf("@")+1;
int endingIndex = email2.lastIndexOf(".");

 String st =email2.substring(beginningIndex,endingIndex);
        System.out.println(st);

        System.out.println("------------------------------------------------");
 email2 =email2.replace("C","K");
email2 =email2.replaceFirst("y","S");
        System.out.println("email2 = " + email2);
        System.out.println("email2 = " + email2);


        System.out.println("------------------------------------");
        String str1 = "Wooden Spoon";

     str1 = str1.replaceFirst("Wo","Spoon");
        System.out.println(str1);
        System.out.println("-------------------------------------");
        String str5 = "Java Programming Language";


        String result1 = str5.substring(str5.indexOf("P"),str5.lastIndexOf(" L"));
        System.out.println(result1);


    }






}
