package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {


        int score = 85;

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
        System.out.println("----------------------------------------------------");

        String result =   (score>=0 && score<=100)? (score>=90)? "Excellent" : (score>=80)? "Great" : (score>=70)? "Good" : (score>=60)? "Passed" : "Failed": "Invalid Number" ;

        System.out.println(result);
    }

}
