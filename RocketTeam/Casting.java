public class Casting {

    public static void main(String[] args) {


       // byte, short,char,int,long,float,double --> Widening Implicit

        byte h = 127;
        int i =h;

        System.out.println(i);


        int a = 123456;
        byte b =(byte) a;
        System.out.println(b);


    }
}
