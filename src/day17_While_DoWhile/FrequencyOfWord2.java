package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {


        String str = "Cat Cat Dog Dog cat CaT";
//                    012
        int frecuency = 0;

        for (int i = 0; i <str.length()-2 ; i++) {

            String eachSub = str.substring(i,i+3);
            System.out.println(eachSub);
            if (eachSub.equals("Cat")){    // if (eachSub.equalsIgnoreCase("Cat"))  if you use it result is 4

                frecuency++;
            }

        }

        System.out.println(frecuency);



    }
}

/*
2. write a program that can return the frequency of the a word Cat
from the sentence

 */