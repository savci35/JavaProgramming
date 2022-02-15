package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {


        String str1 = "    batch  25   ";
        str1.trim();
        //     str1=str1.trim(); if you write like this there are no white spaces before or after text ,except separating words
        System.out.println(str1);
        System.out.println("--------------------------------------------");

        String str2 = "savaş altun";

        int n1 = str2.indexOf("l");//7
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("a"); // its is going on until finding fist a
        System.out.println("n2 = " + n2);//1

        int n3 = str2.indexOf("al");  //6             //in order to find the other a , for example   you write al
        System.out.println("n3 = " + n3);

        String str3 = "Java Programming language";
        int n4 = str3.indexOf("am");//10
        System.out.println("n4 = " + n4);


        int n5 = str3.indexOf("g "); // if you want to give index letter which are a lot , you should add any letter to right of index letter
        System.out.println("n5 = " + n5); //15

        System.out.println("------------------------------------");


        String str4 = "Java Programming language";
        int n6 = str4.lastIndexOf("g");  //23      // if you write like lastIndexOf("g") it starts looking for from right side to left
        System.out.println("n6 = " + n6);               // if you write like IndexOf("g") it starts looking for from left side to right

        System.out.println("----------------------------------------------");

        String s = "Java Nova Cava Wava orange";

        int firstA = s.indexOf("a");                                     // starts looking for from the left to right
        int lastA = s.lastIndexOf("a");                             // starts looking for from the right to left
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
      //int  fourthA = s.indexOf("ava W");
      //int fourthA = s.lastIndexOf("av");// you can write to find fourthA like
        int fourthA = s.indexOf("Ca") + 1; // if you do not write +1 you find C
        int fifthA = s.lastIndexOf("va") + 1;
int seventhA = s.indexOf("a o"); //equals int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("seventhA = " + seventhA);
    }

}
