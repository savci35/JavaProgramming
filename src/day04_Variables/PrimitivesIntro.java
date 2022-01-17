package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

// age:38 years old
        byte age= 38;


        //weight :160 pounds
        // byte weight = 160;  // 160 is out of byte' range-> because of this   you can not use primitive data short, you mast use short
        //byte number = -129;   // -129 is out of byte' range-> because of this   you can not use primitive data short,you mast use short
        short weight = 160;   //129 is within the range of short


        // salary:100000
      //  short salary = 100000; // 100000 is out of range'short because of this   you can not use primitiv data short you mast use int
     int salary = 100000; // int is preferred data typ for numbers

long asset =3333333;
long page =3333333333333L;
/*
 you write a number for primitive typ long you are gonna have a issu because program will know yor number as int because of this you will add
"l or L" end of your code for instance: long asset= 3333333333333333L
*/

        // tax:0.26
float tax= 0.26F; // İf you write a number for decimal you have to write "F" at the end of your code  like long
double PI=3.4;

// Pirimitive data types:  double > float > long > int > short > byte
    }





}
