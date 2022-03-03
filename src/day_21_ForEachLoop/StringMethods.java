package day_21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

                                         //toCharArray()


        String str="Java";

        char[] chars=str.toCharArray();               //[J, a, v, a]      sitringden char array almaın ilk yolu
        System.out.println(Arrays.toString(chars));

        System.out.println("----------------------------");

                              // the other way of doing this

        for (char each:str.toCharArray()) {

            System.out.println(each);
            /*
            J
            a
            v
            a
            */
        }

        System.out.println("------------------------------");

       // aşağıdaki gibi de yapabiliriz önce char atayıp sonrada lop ile çağırabiliriz

        String str1="Java";

        char[] chars1=str1.toCharArray();

        for (char each : chars1) {
            System.out.println(each);
        }

        System.out.println("-----------------------------------------------------------------");

        //                             split()  methods

        String sentence="Wooden Spoon";

        String[] words =sentence.split(" ");

        System.out.print(Arrays.toString(words));

        System.out.println("-----------------------------------------------------------");

        String email= "WoodenSpoon@cydeo.com";

        String[] arr =email.split("@");                  //   neyi belirtirsen ordan sonra diğir array oluşturur
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------------");

        String s= "Today is nice. Today is Monday. today we learn Java ";

        String[] sentences=s.split("\\.");            //[Today is nice,  Today is Monday,  today we learn Java ]   . hata verdiği için \\ escapa squences kullandık
        System.out.println(Arrays.toString(sentences));



    }
}
