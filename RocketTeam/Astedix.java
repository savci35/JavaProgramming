public class Astedix {
    public static void main(String[] args) {

String sum="";
        for (int i = 0; i <=100; i++) {

            if(i%2==0){
               sum+=i+" * ";
            }


        }

        System.out.println(sum);

    }
}




/*
/*print all even numbers between 1 to 100. -
using this pattern:
0 * 2 * 4 * 6 * 8 --> (Pattern : Number+ Blank + Asterix)

hint = for even numbers you can use modulus (number%2 == 0)

*/
