package day17_While_DoWhile;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String str ="AAABBBCAAAAAAAAAA";

        char ch='A';
         int frequency=0; //1+1+1

        for (int i = 0; i <str.length() ; i++) { // i:indexes of str

            char eachChar = str.charAt(i); // eac character of str

            if (ch==eachChar){ // if given ch matching with eachChar,then ch is appeared in the string

           frequency++; //  you can write frequency+=1 insted of frequency++;

            }

        }
        System.out.println(frequency);



            }
        }

/*
warmup tasks:
1. Write a program that can return the frequency of a char from a
String
Ex:
str = "AAABBBC"
ch = 'A'
Output:
3
 */
