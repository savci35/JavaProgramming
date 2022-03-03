import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        int positiveCounter=0;
        int negativeCounter=0;
        int zeroCounter=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (num>0){
                positiveCounter++;
            }else if(num<0){
                negativeCounter++;
            }else {
                zeroCounter++;
            }


        }

        System.out.println("positiveCounter="+positiveCounter);
        System.out.println("negativeCounter= "+negativeCounter);
        System.out.println("zeroCounter= "+zeroCounter);
    }
}
