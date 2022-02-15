package day15_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

//                                                   a ve z nin java da ki değerleri
                                            //A~Z ==>  65~90
        for (int i= 65; i<=90; i++){   // i: 65 66 67 68
            System.out.print((char) i+" ");      //   a   b  c  d                   //       look at this line carrefuly System.out.print((char) i+" ");    we used  casting
        }
        System.out.println();
        System.out.println("------------------------------------------");
        //                                    a~z ==>   65~90
        for (char i= 'a'; i<='z';i++) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("---------------------------------------------");
                                             //Z~A
        for (char i='Z'; i>='A';i--){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("-------------------------------------");
                                               //z~a
        for (char i='z'; i>='a'; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-------------------------------------");
                                        // there are 4000  cahar carecter in java
        System.out.println("---------------------------------------------------------------");



        for (int i = 0; i < 8; i++) {

           System.out.println(" "+"******");

        }

/*     print following shape
       ******
       ******
       ******
       ******
       ******
       ******
       ******
       ******


 */













        }


        }














