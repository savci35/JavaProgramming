package day06_PrimitiveTypeCasting;

public class PrimitiveCastings {

    public static void main(String[] args) {
/*
        byte a= 5;
        short b= a;      // they are implicit casting
        int c= b;
        long d= c;
        float e = d;
        double f = e;

        // smaller primitives can be directly assigned to larger primitives type
        // larger primitives type can NOT be directly assigned to smaller primitives ( need to be casted manually)
 */
        int a = 55;
        long b = a; //implicit casting

        System.out.println(a + " :  " + b);

        System.out.println("---------------------------------------------");


        long j = 100L;      // OUTPUT = 1000000 : 16960 BECAUSE range of short < long of range

        short k = (short) j;
        System.out.println(j + " : " + k);
        // larger primitives type can NOT be directly assigned to smaller primitives (I have assigned larger primitives type  to smaller primitives type)

        double l = 2.5;
        float m = (float) l;                //   they are explicit casting
        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) (long) n; // but if you write like int s = (int) n; result = 10 because int has only integer numbers


        System.out.println(n + " : " + s);
        System.out.println("_______________________________________");

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+" : "+s1);





    }
}



