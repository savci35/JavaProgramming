package day09_Statements;

public class NameOfDay {
    public static void main(String[] args) {

        int number =5;//1~7

        if (number==1){
            System.out.println("monday");
        }else if (number==2){
            System.out.println("tuesday");
        }else if (number==3){
            System.out.println("wednesday");
        }else if (number==4){
            System.out.println("thursday");
        }else if (number==5){
            System.out.println("friday");
        }else if (number==6){
            System.out.println("saturday");
        }else if (number==7){
            System.out.println("sunday");
        }else {System.out.println("invalid day");}

        System.out.println("=================================================");

        String day;
        if (number==1){
           day="Monday";
        }else if (number==2){
            day="Tuesday";
        }else if (number==3){
            day="Wednesday";
        }else if (number==4){
            day="Thursday";
        }else if (number==5){
            day="Friday";
        }else if (number==6){
            day="Saturday";
        }else if (number==7){
            day="sunday";
        }else {
            day="invalid day";
        }

        System.out.println("day = " + day);


    }
}
