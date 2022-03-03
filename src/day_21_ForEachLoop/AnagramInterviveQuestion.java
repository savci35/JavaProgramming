package day_21_ForEachLoop;

import java.util.Arrays;

public class AnagramInterviveQuestion {
    public static void main(String[] args) {

        //                  intervive question



        String st1= "abcd";
        String st2= "dbca";

        // write a program that can check if  str1 & str2 are build out same chracters

       char[] ch1= st1.toCharArray();
        char[] ch2=st2.toCharArray();           //  1  adım :ikisinide array yaptık


        System.out.println(Arrays.toString(ch1)); //[a, b, c, d]
        System.out.println(Arrays.toString(ch2));//[d, b, c, a]     2 adım : sonra burada kıyasladık eşit değiller indekslerdeki karekterler birbirine eşit değil

        System.out.println();// boşluk koydum araya output icin

        Arrays.sort(ch1);
        Arrays.sort(ch2);                                      //  3. adım  burada sort  yardımı ile sıraladık karekterleri

        System.out.println(Arrays.toString(ch1)); //[a, b, c, d]  //  4. adım burada görüldüğü gibi şuan indeklerdeki karekterler birbirlerine eşit
        System.out.println(Arrays.toString(ch2));  //[a, b, c, d]

        boolean anagram =Arrays.equals(ch1,ch2);          // 5. adım burada birbirlerine eişt olduklarını kontrol ettiv ve sonuç true oldu anagram olduklarını gördük
        System.out.println(anagram);          //true
    }
}
