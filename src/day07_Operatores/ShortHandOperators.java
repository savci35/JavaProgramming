package day07_Operatores;

public class ShortHandOperators {
    public static void main(String[] args) {

     //   = in math equal but in java = assignment

      int number = 100;//100

        System.out.println("number = " + number);


        number= 200; //200

        System.out.println("number = " + number);

        String word ="Java Programing";  //java Programing

        System.out.println("word = " + word);

        word="Wooden Spoon"; //Wooden Spoon

        System.out.println("word = " + word);

             word ="Cydeo";

        System.out.println("word = " + word);

         word ="Java Programing";  //java Programing

        System.out.println("word = " + word);
        System.out.println("----------------------------------------------");

                            // Addition Assignment
        int x = 100;
        System.out.println("x = " +x );
        System.out.println(x +200);//300

       x =x+200;// you can write this code like x+=200

        System.out.println("x = " + x);

        String str = "Wooden";
        str+= "Spoon";

        System.out.println("str = " + str);

        double number1 = 2.5;
        System.out.println("number1 = " + number1);
        number1+= 5.5;
        System.out.println("number1 = " + number1);


double availableBlance =1000.3;
//deposite 300
availableBlance+=300;

        System.out.println("availableBlance = " + availableBlance);
        System.out.println("---------------------------------------------------");

                                    // Subtraction Assignment
                                            // a-=b; yıu ca write like a=a-b;
       // withdrawing=500
        availableBlance -= 500;
        System.out.println("availableBlance = " + availableBlance);
//withdrawing 200 than depositing 400
        availableBlance-=200;  //600.5
        availableBlance+=400;   //1000.5
        System.out.println("availableBlance = " + availableBlance);
        System.out.println("---------------------------------------------------------");
                                      // Multiply Assignment
                                      //  a *= b; you can write code like a= a * b
double salary = 5000.1;
        System.out.println("salary = " + salary);

        salary *=2;
        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *=1000000;
        System.out.println("doge = " + doge);

                      // Divide Assignment
                   // a= a /b you can write this like a/=b

        double num2 = 5000.0;
                num2/=5;
        System.out.println("num2 = " + num2);
        System.out.println("----------------------------------------------------");
                                 //Remainder Assignment
                             //     a%=b; you can write this like a=a%b;
       double num3 = 100;
       num3%= 3;
        System.out.println("num3 = " + num3);
        System.out.println("----------------------------------------------");
        int amount=127; //cent
        int quarters= amount/25;
        int cent=127%25;
        System.out.println("cent = " + cent);
        System.out.println("quarters = " + quarters);
        System.out.println("---------------------------------------");
        int cent2=127;
        cent2%=25;
        System.out.println("cent = " + cent);
        System.out.println("---------------------------------------------");

        int y =300;
        y%=16;
        System.out.println("y = " + y);
        System.out.println("--------------------------------------------");
        int balance= 3500;
       // insurance fee :1536
        balance%=153;
        System.out.println("balance = " + balance);


    }
}
