package day07_Operatores;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        System.out.println(num1<0); //false
        System.out.println(num2<0);// true

        System.out.println("--------------------");

        int a = 5;
        ++a;  // pre increment:increases the value by 1 rihgt away
        System.out.println(a); //6
        --a; //pre decrement : decreases the value by 1 rihgt away
        System.out.println(a); //5
        System.out.println("--------------------");
int b= 100;
        System.out.println(++b);// pre increment:increases the value by 1 rihgt away

        int c = 100;
        System.out.println(c++); //post increment: first passes the current value , then increases the value by 1
        System.out.println(c); //101


        System.out.println("--------------");
        int x= 200;
        System.out.println(--x);// pre decrement: decreases the value by 1 right away

        int y = 200;
        System.out.println(--y);  //post decrement: first passes the current value , then decreases the value by 1
        System.out.println(y); //199

        System.out.println("------------------------------------------------------");

        int s = 45;
        System.out.println(++s); //46 pre increment
        System.out.println(s++); //46 post increment first value is the same
        System.out.println(s); //47  second increases by 1

        int z = 45;
        System.out.println(--z); //44
        System.out.println(z--); //44
        System.out.println(z); //43

        int k =25;

        System.out.println(++k);//26
        System.out.println(--k);// 25

        int m =25;

        System.out.println(m++);//25
        System.out.println(m);
        System.out.println(m--);// 26

         }
}
