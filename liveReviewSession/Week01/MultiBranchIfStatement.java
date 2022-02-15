package Week01;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        int number= 0;

        if (number<0){
            System.out.println("Negative");
        }else if (number>0){
            System.out.println("Positive");
        }else{
            System.out.println("Zero");
        }
        System.out.println("---------------------------------------");

        int score = 50;
 char grade;// A,B,C,D,F

        if (score>=90){
            System.out.println("grade=A"); // you can write  grade ='A' isted of  System.out.println("grade=A");
        }else if (score>=80){
            System.out.println("grade=B");  // you can write  grade ='B'
        }else if (score>=70){
            System.out.println("grade=C");  // you can write  grade ='C'
        }else if(score>=60){
            System.out.println("grade=D");  // you can write  grade ='D'
        }else{
            System.out.println("grade=F");  // you can write  grade ='F'
        }
                                           //  System.out.println(grade);
    }

}
