package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                break;      // if you use continue; result is A B D E
            }                    // if you use break; result is A B
            System.out.println(i);
        }

        System.out.println("-----------------------------------------");
        // print all even numbers 1~10 (skip all odd numbers)
        for (int i = 0; i <= 11; i++) {

            if (i % 2 != 0) {
                continue;

            }
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");
        // print all even numbers 1~10 (skip all even numbers)
        for (int i = 1; i < 11; i++) {

            if (i % 2 == 0) {
              continue;
            }
            System.out.print(i + " ");
        }


    }
    }

