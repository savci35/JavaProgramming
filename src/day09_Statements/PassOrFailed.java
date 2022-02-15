package day09_Statements;

public class PassOrFailed {
    public static void main(String[] args) {

        int score = 89 ;



        if (score>=75){
            System.out.println("Congrats, you pass");

        }else {
            System.out.println("Failed");
        }
        System.out.println("----------------------------------------");
        boolean isFailed= score<75;
        if (!isFailed){
            System.out.println("Congrats, you pass");
        }
        if(isFailed){
            System.out.println("Failed");
        }



    }
}
