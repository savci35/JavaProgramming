package day15_ForLoop;

import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
//1. Write a program that can return the sum of even numbers between 1 to 100
int sum =0;
        for (int i = 0; i<100 ; i+=2) {



            sum+=i;


        }

        System.out.println("sum = " + sum);

        System.out.println("---------------------------------");

        //2. Write a program that can return the sum of odd numbers between 1 to 100

int sum1=0;
        for (int i=1; i<100; i+=2){


           sum1+=i;
        }
        System.out.println("sum1= "+sum1);

        System.out.println("----------------------------------");

        /*
        3. write a program that can calculate the sum of all numbers between
1 to any given number
ex:
input: 100
output: 5050
input: 50
output: 1275
         */

        int number=5;
        int sum3=0;
        for (int i=1; i<=number;i++){

            sum3+=i;
        }
        System.out.println("sum3 = " + sum3);

        System.out.println("---------------------------------------");

     /*  4. Write a program that can return the factorial number of any given
        number
        Ex:
        input: 5
        output: 120
        ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
     */
        int num1 =5;
        int factorial =1;

        for (int i = 1; i <=num1 ; i++) {

factorial*=i;
        }
        System.out.println("factorial = " + factorial);
        System.out.println("-------------------------------------------");
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */

String str ="mn@#123Ab!";
String digits="";
String specialChars="";
String letters="";


        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

           if (ch>='1' && ch<='9'){

               digits+=ch;
           }else if(ch<='Z' && ch>='A'||(ch<='z' && ch>='a' ) ){
               letters+=ch;}

       else{
            specialChars+=ch;
           }
        }

        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
        System.out.println("digits = " + digits);

        System.out.println("----------------------------------------");

/*
6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
                ...
*/
        String str1="A1B2C3";
      int result =0;

        for (int i = 0; i <str1.length(); i++) {

         char ch = str1.charAt(i);


            if (Character.isDigit(ch)) {
                result +=Integer.parseInt(ch+"");

            }
        }
        System.out.println("result = " + result);

        System.out.println("-------------------------------");

        /*
        7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
         */
        String str2="Wooden Spoon";
        String result2="";

        for (int i =str2.length()-1; i >=0 ; i--) {

        result2  += str2.charAt(i);

        }
        System.out.println(result2);

        System.out.println("--------------------------------------");

        /* Write a program that can check if the given String is palindrome
        Ex:
        input:
        Level
        output:
        true
        input:
        Anna
        output:
        true
*/

  String sentence = "kayak";
String reserved ="";

        for (int i = sentence.length()-1; i >=0 ; i--) {


            reserved +=  sentence.charAt(i);

        }
boolean isPolindrome =sentence.equalsIgnoreCase(reserved);
        System.out.println(isPolindrome);



    }

}
