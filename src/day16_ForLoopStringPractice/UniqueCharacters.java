package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str ="aabccc";

        String result ="";

        for (int i = 0; i <=str.length()-1 ; i++) {


            char ch =str.charAt(i);  // ch : each characters of str

            // System.out.println(result); eğe burada çalıştırırsam tüm karakterleri yazdıracak if satırında unique leri ayıracak

            if (str.indexOf(ch) == str.lastIndexOf(ch)){ // if the first and last index of numbers of character are the same , then the character s unique


                result += ch;
            }

        }
        System.out.println(result);


    }

}
/*
3. Write a program that can return the unique characters from a
String
Ex:
input:
AABCCD
output:
BD
Hint: You will need indexOf() and
lastIndexOf()
  if the first and last index
numbers of the character are same, then it's unique

  indexOf('A') ==> 0
  lastIndexOf('A') ==> 1

   indexOf('B') ==>2               if        indexOf == lastIndexOf ==> unique
  lastIndexOf('B') ==> 2
 */