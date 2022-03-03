package day17_While_DoWhile;

public class DoWhileLoopIntro {

    public static void main(String[] args) {
        boolean a = false;
        for (int i = 0;  a;) {
            System.out.println("Wooden Spoon--for loop");
        }


        while (a){                             // eğer condition false olduğunde durur , true olduğunda ise çalışır
            System.out.println("Wooden Spoon--while loop");
        }
        System.out.println("------------------------------------");

        do {                                                  // do en az bir kere yazdırmaya yardımcı olur ve while false ise durur fakat while true olursa çalışmaya devam eder "do while" ın
            System.out.println("Wooden Spoon--do-while loop");              // while ve for loop tan tek farkı budur intervivlerde sorulabilir
        }while (a);
    }
}
