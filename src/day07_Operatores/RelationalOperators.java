package day07_Operatores;

public class RelationalOperators {
    public static void main(String[] args) {

        //  < ,<= ,> ,>=

boolean result = 20>40; //false
boolean result2 = 20>10; //true
        System.out.println("result = " + result);
        System.out.println("result2 = " + result2);

        boolean result3 = 100>=100; // 100 is not bigger than 100 but equal because o this true
        System.out.println("result3 = " + result3);

        boolean result4 = 300>=500; //eighter 500 is not bigger than 300 nor equal because o this false
        System.out.println("result4 = " + result4);

       // credit score of 720

        int creditScore =745;
                                                                                             //haksahibi
         boolean isEligiibleForloan = creditScore>=720; // if creditScore is 720  or greater than eligible is eligiible
        System.out.println("isEligiibleForloan = " + isEligiibleForloan);


        boolean result5= 100<120; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 500<300; // false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score<=59;    //true
                         //   59<=59
        System.out.println("hasFailed = " + hasFailed);


        int score1 = 75;
        boolean hasFailed1 = score1<=59;  //false
                          //   59<=75
        System.out.println("hasFailed1 = " + hasFailed1);

        boolean result7 = 45<=60; //true
        System.out.println("result7 = " + result7);

        System.out.println("---------------------------------------");

        int a = 100;
        int b= 200;

        boolean equal = a==b;  // 100==200 false
        System.out.println("equal = " + equal);

 boolean result8 = "Muhtar" == "Good Guy"; // false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A'=='a';  // false
        System.out.println("result9 = " + result9);

        boolean result10= "Java"=="Java";  //true
        System.out.println("result10 = " + result10);

        // "Hello World" == "hello World" false
        System.out.println("-------------------------------------");

        boolean result11 = 100 != 200; //true
        System.out.println("result11 = " + result11);

        boolean result12= "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13=300  != 300; //false;
        System.out.println("result13 = " + result13);

    }
}
