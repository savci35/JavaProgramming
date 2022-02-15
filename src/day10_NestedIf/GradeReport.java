package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {
        /*
        90 ~ 100: excellent
        80 ~ 90:Grade
        70 ~ 79:Good
        60 ~ 69:Passed
        0~59:failed
            */

        int score=75;


        if (score>=0 && score<=100){

             if (score>=90){
                System.out.println("Excellent");
            }

            else if (score>=80){
                System.out.println("Great");
            }
            else if (score>=70){
                System.out.println("Good");
            }
            else if (score>=60){
                System.out.println("Passed");
            }
            else{
                System.out.println("failed");
            }
        }else {
            System.out.println("Invalid Number");
        }


        System.out.println("--------------------------------------------");
        String result="";
        if (score>=0 && score<=100){

            if (score>=90){
                result="Excellent";
            }

            else if (score>=80){
                result="Great";
            }
            else if (score>=70){
              result="Good";
            }
            else if (score>=60){
                result="Passed";
            }
            else{
                result="failed";
            }
        }else {
            result="Invalid Number";
        }
        System.out.println(result);

    }
}
