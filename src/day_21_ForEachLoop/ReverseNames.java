package day_21_ForEachLoop;

public class ReverseNames {
    public static void main(String[] args) {

        String[] names ={"Savaş Altun","Ebru Altun","Barış Altun","Aslı Kacan","Nebahat Çelebi","Murat Köprülü"};


        for (String each : names) {      //"Savaş Altun","Ebru Altun","Barış Altun","Aslı Kacan","Nebahat Çelebi","Murat Köprülü"


            String reversed ="";

            for (int i = each.length()-1; i >= 0; i--) { //reverses string

                reversed+=each.charAt(i);
            }

            System.out.println(reversed);

        }
    }
    }

