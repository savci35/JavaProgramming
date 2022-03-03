package day_21_ForEachLoop;

public class AverageNumber {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60};


        double sum=0;
/*
        for (int i = 0; i < numbers.length; i++) {

            sum+=numbers[i];

        }

        double average=sum / numbers.length;

        System.out.println("average = " + average);
*/

         //   the other way of solving task using foorEach loop

        for (int each : numbers) {

            sum+=each;

        }
      double average1=sum/ numbers.length;
        System.out.println("average1 = " + average1);
    }
}
