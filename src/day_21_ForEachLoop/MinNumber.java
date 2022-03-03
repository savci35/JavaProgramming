package day_21_ForEachLoop;

public class MinNumber {
    public static void main(String[] args) {
        int[] numbers={100,500,30,40,600,80,90};

        int min=numbers[0];
   for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]<min){
                min=numbers[i];

            }

        }
        System.out.println("min = " + min);

        System.out.println("---------------------------------------");


        // the other way of solving task using foreach loop

//                each yazabiliriz yada herhangi birşey number yerine
        for (int number : numbers) {

            if (number<min){
                min=number;
            }

        }
        System.out.println("min = " + min);
    }
}
