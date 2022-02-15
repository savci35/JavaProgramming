package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "AABBAACC";

        String result = ""; // ABC should be in result
        // i<=7  ==> i<8 they are the same
        for (int i = 0; i <= str.length()-1; i++) { // i represents the all the index numbers of str (start from 0)

          String ch =""+ str.charAt(i);  // represent each Character of str

            if (!result.contains(ch)){// if the character is not contained in result
                result += ch; // the character will be added to result
            }


        }
        System.out.println(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a
String
Ex:
input:
AABBCCBC
Output:
ABC
Hint: You can add each characters of the
string into another String
  Condition: the character is not
contained in the other String yet before you are adding
 */