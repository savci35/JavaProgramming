package day16_ForLoopStringPractice;
public class Reverse {

    public static void main(String[] args) {

String str = "Wooden Spoon";
//index:      0123456789


String result = ""; // contain the reversed version ofstr
// noopS nedooW               result ı boş kutu die düşündüğümüzde  her aşamada bir harfi içine atacak index numaralarına göre aşağıda yazdığımız sıraya göre
/*
        result += str.charAt(11); // n
        result += str.charAt(10); // o
        result += str.charAt(9); // o
        result += str.charAt(8); //p
        result += str.charAt(7); // S
        result += str.charAt(6); // " "
        result += str.charAt(5); // n
        result += str.charAt(4); //e
        result += str.charAt(3); // d
        result += str.charAt(2); // o
        result += str.charAt(1); // o
        result += str.charAt(0); //W

*/

     //           str karecter sayısı str.length()-1 ile bulunur
        for (int i = str.length()-1; i >=0 ; i--) { // i: index numbers of str (starting last index to index 0)

            result +=str.charAt(i);  // adding each character to result

        }

        System.out.println(result);



    }
}
/*
Java Day16
Topics: For loop + String
package name: day16_ForLoopStringPractice
tasks
1. Write a program that can reverse a String
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */