public class Task1 {

    public static void main(String[] args) {


        for (char i = 'A'; i <= 'Z'; i++) {

            if(i=='B'||i=='H'||i=='K'){

                continue;
            }
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("----------------");

        for (int i = 0; i <=100 ; i++) {

            if (i%2==0){
                continue;
            }
            System.out.print(i+" ");
        }


    }
}
