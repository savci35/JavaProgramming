package day_20_Array;

public class MaxNumberOfArray {
    public static void main(String[] args) {
        
        int[] numbers ={10,5,4,20,1,0};
        int max=numbers[0];//10

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]>max){ // if there is element in the array that's greater than the current max number
                max=numbers[i];  //assigning greater number to variable max
            }
                                                            // önce bir tane max number seçtim ölesine int max=numbers[0];//10  olsun dedim ve
                                                           // if bloğunda max numberdan büyük olan varsa yeni max number o olur taki en son loop tamamlanınca aralarında ki en büyüğü bulana dek
        }
        System.out.println("maxNumber= "+max);
    }
}
