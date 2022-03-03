public class SumOfNumbers {
    public static void main(String[] args) {
int sumOfEven=0;
int sumOfOdd=0;

        for (int i = 0; i <=6 ; i++) {
            
            if (i%2==0) {
               sumOfEven += i;
            }
            if(i%2==1){
            sumOfOdd+=i;
        }
            
        }
        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);


    }
}
