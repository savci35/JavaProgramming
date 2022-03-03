package day_19_LoopPractices;

public class FrecuencyOfCharacterInterviveQuestion {
    public static void main(String[] args) {

        String str = "aabcccd";
        String result = "";    //a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  // each char from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { // to find the frecuency of each charecter

                char each = str.charAt(i);    // each charecter of str

                if (ch == each) {

                    count++;
                }

            }
            if (result.contains("" + ch)) {
                continue;
            }

            result += ch;
            result += count;

        }


        System.out.println(result);


    }
}
/*
Tasks:
1. Write a program that can find the frequency of the characters
from a string
 Ex:
str = "aabcccd";
output:
a2b1c3d1
 */

///aşağıdaki kodu yazınca sadece a karekterinini kaç adet olduğunu bulduk fakat bbunu diğer bir for loop un içine koyaarsak tüm karekterlerin kaçar adet olduğunu buluruz.
/*
   char ch=str.charAt(0); //'a'
         int count=0;

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (ch==each){

                count++;
            }

        }

        System.out.println(count);
 */