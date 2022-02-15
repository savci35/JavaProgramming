package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
                   // isEmpty()
        String str = " ";

    boolean r =str.isEmpty(); // it can also  see spaces


        System.out.println(r);

        System.out.println("-----------------------------------");

                  //  isBlank()

        String str1 = "                ";  // isBlank method needs to see caracter  1, a,A,^# etc.. it can not spaces

        boolean r1 = str1.isBlank();
        System.out.println(r1);

        System.out.println("-------------------------------------------------------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

      boolean a= s1.equals(s2); //false
        System.out.println(a);

// you can also write  System.out.println(s1.equals(s2));

        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println("------------------------------------------");

   //     Yes,YES, yEs, YEs


        System.out.println("Yes".equals("YEs"));// false  equals does not ignore something that is upperCase or lowerCase , something should be the same

        System.out.println("Yes".equalsIgnoreCase("YEs"));//true equalsIgnoreCase  ignores something that is upperCase or lowerCase

        System.out.println("------------------------------------------------------------------------------------------");

        String sentence = " My favorite programming language is Java";

        System.out.println(sentence.contains("favorite ")); // true

        boolean hasJava =sentence.contains("Java"); //true
        System.out.println(hasJava);

        boolean hasJava2 =sentence.contains("java");// false
        System.out.println(hasJava2);

        boolean hasJava3 = sentence.toLowerCase().contains("java"); // true           only contains Method ignore //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(hasJava3);

boolean hasJava4 = sentence.toUpperCase().contains("JAVA");//true                     only contains Method ignore //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        System.out.println(hasJava4);

        System.out.println("-------------------------------------------------------");

        String input = "I love Java";
        String input2 = "Java";

        System.out.println(input.equals(input2));// false
        System.out.println(input.equalsIgnoreCase(input2)); //false
        System.out.println(input.contains("Java"));//true

        System.out.println("-------------------------------------------------------");


        String input3 = "I love jAvA";
        System.out.println(input3.toLowerCase().contains("java")); //true
        System.out.println(input3.toUpperCase().contains("JAVA"));// true

        System.out.println("--------------------------------------------------------------------------------------------");
                                              // startsWith
        String s ="Wooden Spoon";
     boolean ss= s.startsWith("Woo");//true               //   it can start more than one carecter  "Woode" or "W"
        boolean ss1 =s.startsWith("oo");// false


        System.out.println(ss);
        System.out.println(ss1);

                                              // endsWith


        boolean ss2 = s.endsWith("Spoon"); // true
        System.out.println(ss2);

        boolean s3 = s.endsWith("oon"); //true
        System.out.println(s3);

boolean s4 =s.endsWith("ooden");  // false
        System.out.println(s4);

        boolean s5 = s.toLowerCase().startsWith("wooden"); // true  in order to ignore case sensitivity we firs create the lowerCase or upperCase
        System.out.println(s5);
    }
}
