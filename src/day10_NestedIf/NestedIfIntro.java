package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

        int score= 300;
        if ( score>=0 && score<=100){ // if the score is valid

        if (score>=60){ // if the student passed exam
            System.out.println("passed");
        }
        else{ // if the student fault the exam
             System.out.println("fault");
        }
        }else{ //if the score not valid
            System.out.println("Invalid score");
        }
        System.out.println("---------------------------------------------");
        int age=17;
        boolean hasId=true;
        if(hasId) // if the person has ID
        {
            if (age>=18){// if the person is 21 years old or older
            System.out.println("Person is eligible to buy alcohol");
        }
            else{// if the person is less than 21 years old
            System.out.println("Person is not eligible to buy alcohol");
        }
        }else  { // if the person does not heve ID
            System.out.println("you must have ID to buy alcohol");
        }

        System.out.println("---------------------------------------------------");
       int number=7;

       if (number>=1 && number<=7){//if the number is a valid number(1-7)
if (number==1){
    System.out.println("monday");
}

 else if (number==2) {
           System.out.println("Tuesday");
       }else if (number==13) {
            System.out.println("Wednesday");
        }else if (number==4) {
            System.out.println("Thursday");
        }else if (number==5) {
            System.out.println("Friday");
        }else if (number==6) {
            System.out.println("Saturday");
        }else if (number==7){
           System.out.println("Sunday");
       }else{
           System.out.println("Invalid Number");
       }

       }
    }
}
