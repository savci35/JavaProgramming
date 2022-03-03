package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {

        String word = "savaş";
       //              01234
        String reserved ="";

        for (int i = word.length()-1; i >= 0; i--) {

        reserved +=  word.charAt(i);
         //   System.out.println(reserved);        yazarsan tüm aşamaları görürsün
        }

boolean isPalindrome = word.equalsIgnoreCase(reserved);
        System.out.println("isPalindrome = " + isPalindrome);


    }

}
/*
"Java" ==> "avaJ" ==> false (not polinrome)
" Anna" ==> "annA" ==>  true

"Level"
"Racecar"

 */