package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {



        for (int i=15; i<=45; i++){             // 15 16 17 18 19 ....45
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");


        System.out.println("------------------------");


        for (int i=100; i>=50; i--){  //i:100 99 98 97 .......50
            System.out.print(i+" ");
        }

        System.out.println();// you can use this code to have a new line
        System.out.println("ali");

        System.out.println("--------------------------------");

                                  // print all the even numbers between 1~55:

        for (int i=2; i<=54; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("------------------------------");
                                     // the  other way

        for (int i = 1; i <=55 ; i++) {

            if (i%2==0){
                System.out.print(i+" ");
            }

        }

    }
}
