package day17_While_DoWhile;

public class LoopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println("i= "+i);

        }

        System.out.println("----------------------------------------");
        int a = 0;
        while (a<=10){
            // you can write  a++; here
            System.out.println("a= "+a);
            a++;
        }
        System.out.println("-----------------------------------------");
        int y =0;
        do {

            System.out.println("y= "+y);
            y++;           // you should write here
        }while (y<=10);

    }

}
