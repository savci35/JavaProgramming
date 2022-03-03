package day_20_Array;

public class MinNumber {
    public static void main(String[] args) {

        int[] numbers={100,500,30,40,600,80,90};
// index  :             0   1   2  3  4   5  6
        int min=numbers[0];//100

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]<min){ //if there is an element in the array that's smaller
                min=numbers[i];  //smaller number will be assigned to the variable min
            }

        }
        System.out.println(min);
    }
}
/*
1  ı took index 0  as min number
2  ı compared it with index 1 and index 0 < index 1 so index 0 is min number
3  ı compared index 0 with index 2 and index 2 < index 0 so index 2 is new min number
4  ı compared index 2 with index 3 and index 2 < index 3  yes so index 2 is still min number
5  ı compared index 2 with index 4 and index 2 < index 3  yes so index 2 is still min number
6  ı compared index 2 with index 5 and index 2 < index 5  yes so index 2 is still min number
7  ı compared index 2 with index 6 and index 2 < index 5  yes so index 2 is still min number

          because of this inde 2 is the smallest number from others
 */