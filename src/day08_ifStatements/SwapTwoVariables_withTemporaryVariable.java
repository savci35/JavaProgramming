package day08_ifStatements;

public class SwapTwoVariables_withTemporaryVariable {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
//-----------------------------------------------------------
        int c=b;
     b=a;
     a=c;

//--------------------------------------------------------------

        System.out.println("a = " + a); //15
        System.out.println("b = " + b);//10




    }
}
/*
write a that can swipe two variables' value by using a temporary variable

Ex
if a=10, b=15
output:
         a=15
         b=10

 */