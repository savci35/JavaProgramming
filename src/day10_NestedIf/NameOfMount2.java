package day10_NestedIf;

public class NameOfMount2 {
    public static void main(String[] args) {
int number =8;
        if (number>=1 && number<=12){
            System.out.println("valid number");

            if (number==1){
                System.out.println("January");
            }
            else if (number==2){
                System.out.println("February");
            }
            else if (number==3){
                System.out.println("March");
            }
            else if (number==4){
                System.out.println("April");
            }
            else if (number==5){
                System.out.println("May");
            }
            else if (number==6){
                System.out.println("June");
            }
            else if (number==7){
                System.out.println("July");
            }
            else if (number==8){
                System.out.println("August");
            }
            else if (number==9){
                System.out.println("September");
            }
            else if (number==10){
                System.out.println("October");
            }
            else if (number==11){
                System.out.println("November");
            }
            else {
                System.out.println("December");
            }




        }else{
            System.out.println("invalid number");
        }
        System.out.println("-------------------------------------------------------------");

        // : = else  ? = if


        String result = (number==1)? "January" :(number==2)? "February" :(number==3)? "March" : (number==4)? "April" :(number==5)? "May" : (number==6)? "June" :(number==7)? "July" :(number==8)?"August":
                (number==9)? "September" :(number==10)? "October" :(number==11)?"November" : (number==12)? "December":"invalid number";
        System.out.println(result);

        System.out.println("--------------------------------------------------------------");

       //if you  can write this code without parantez

        result = number==1? "January" :number==2? "February" :number==3? "March" : number==4? "April" :number==5? "May" : number==6? "June" :number==7? "July" :(number==8)?"August":
                number==9? "September" :number==10? "October" :number==11?"November" : number==12? "December":"invalid number";
        System.out.println(result);




    }
}
