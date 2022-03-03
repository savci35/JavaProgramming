package day_21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

                          //   copyOf() yazılışı :  copyOf( array1,newLenggth) : copys the elements of array. starting first element to given number ,returns new array

        String[] students={"Elif","Sinem","Gunay","Cihad","David","James","Aaron","Daniel"};
//
        String[] earlyBirds = Arrays.copyOf(students, 3);  // kaç yazarsak okadar öğe alır  mesela 30 yazarsam isimlerin hepsini alır ve gerisini "null" yazar
        System.out.println(Arrays.toString(earlyBirds));


        System.out.println("----------------------------");

        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        numbers=Arrays.copyOf(numbers,5); //{1,2,3,4,5}
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------------------");


          //  copyOfRange() yazılışı : copyOfRange(array,beginningIndex,endingIndex): copys the elements of array, starting from beginning index till the ending index(ending index excluded),returns new array

        char[] ch1 ={'A','B','C','D','E','F','G','H','I'};
//  index             0   1    2   3  4   5   6   7
        char[] ch2=Arrays.copyOfRange(ch1,2,6); // sonuncu dahil etmez
        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------------------------------");

int[] scores={10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
// index       0   1   2   3   4   5   6   7   8   9
int[]  result=Arrays.copyOfRange(scores,3,7); //[40, 50, 60, 70]  mesela 90 nı da dahil etmek istiyorsa int[]  result=Arrays.copyOfRange(scores,3,7+1); yazabilirsin
        System.out.println(Arrays.toString(result));


        int[] result2 =Arrays.copyOfRange(scores,5,scores.length);//[60, 70, 80, 90, 100]
        System.out.println(Arrays.toString(result2));
    }
}
