package day_19_LoopPractices;

public class LoopsWithoutCurlyBraces {

    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            System.out.println("Cydeo");
            System.out.println("Batch 25");
        }
        System.out.println("=========================================");

        for (int i = 0; i <5 ; i++)          //  for loop can work without curly braces but only  one statements
            System.out.println("Cydeo");  // sadece for loop un altındaki kısım istenilen kadar çalışır diğeri sadece bir kez çalışır
        System.out.println("Batch 25");


        System.out.println("========================================");

        for (int i = 0; i <5 ; i++)
            System.out.println("Batch 25");
    }
}
