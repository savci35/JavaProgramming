package day_21_ForEachLoop;

import java.sql.Array;
import java.util.Arrays;

public class MergeTwoArray_Intervive {
    public static void main(String[] args) {

        String[] group1={"Ali", "Layan", "Aysenur"};
        String[] group2={"Maria","Aygun","Duygu","Suat","Valeriy"};

        String[] merge=new String[group1.length + group2.length];
/*
        System.arraycopy(group1,0,merge,0,group1.length);
        System.arraycopy(group2,0,merge,group1.length,group2.length);
*/
        for (int i = 0; i < group1.length; i++) {
            merge[i]=group1[i];
        }
        for (int i = 0; i < group2.length; i++) {
            merge[i+ group1.length]=group2[i];
        }


        System.out.println(Arrays.toString(merge));


    }
}
