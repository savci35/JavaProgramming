package Replit;

public class Task4 {
    public static void main(String[] args) {

        String str ="A1B2C3";
        int result =0;
int x;
int zero ='0';

        for (int i = 1; i <str.length() ; i++) {

            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
               x= str.charAt(i);
                System.out.println(x+" ");

                result+=x-zero;
            }

        }
        System.out.println(result);

        System.out.println("-----------------------------------");

        int two ='9';                             //  asci charecter bulabilirsin
        System.out.println(two);

    }
}
/*
6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:

   '0' - 48   ==> 0

   '1' - 48   ==> 1
 */