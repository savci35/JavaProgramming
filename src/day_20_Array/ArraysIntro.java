package day_20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names


        // String myGroup[]; they are the same
        String[] myGroup = new String[5];  // it starts from 0
        myGroup[0] = "Günay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";        // myGroup[3] = "Hulya";          //  eğer ikisini de indeksini aynı verirsek ilkini atlar yazdırmaz mikail yazdırır
        myGroup[4] = "Mikail";       //   myGroup[3] = "Mikail"

        //    System.out.println(myGroup); hashcode

        System.out.println(Arrays.toString(myGroup)); //["Günay","Neira","Suat","Hulya","Mikail"]

        System.out.println("--------------------------------");
                                        //  non primitive defoult gives [null]
        int[] myGroup1 = new int[5];   // primitive data typ int byte short long gives defoult [0]
                                        // primitive data typ float double  gives  defoult [0.0 ]
                                       // primitive data typ booluen gives defoult [ false]
        System.out.println(Arrays.toString(myGroup1));

        System.out.println("-------------------------------------");

        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
   //  index              0        1         2           3          4          5         6
        System.out.println(Arrays.toString(days));

        int number=5;
        if (number<1||number>7){
            System.err.println("Invalid Number");
        }


        System.out.println(days[number]); // Saturday
        System.out.println(days[number-1]);  //Friday

    }

}
