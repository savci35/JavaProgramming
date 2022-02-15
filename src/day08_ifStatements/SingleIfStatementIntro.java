package day08_ifStatements;
//if statements:
//Single if: can be used creating cindition for 1 possible output
public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 101;

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = !evenNumber;//not even number
        if (evenNumber) {//even number
            System.out.println(number + " is even number");

        }
        if (oddNumber) {//odd number
            System.out.println(number + " is odd number ");

        }


        int n = 200;

        //positive

        if (n > 0) {// if the n is greater than zero,than it is positive
            System.out.println(n + "is positive");
        }

//negative

        if (n < 0) { //if the n is less than zero, than it is negative
            System.out.println(n + "is negative");
        }
//zero
        if(n==0){
            System.out.println(n+" is zero");

        }
    }

}





