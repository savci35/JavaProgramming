package day_20_Array;

public class NameOfMounts {
    public static void main(String[] args) {

        String[] mounths ={"January","February","March","April","May","Jun","July","Agust","September","October","November","December"}; //index 0~11(length-1) last index
//                           0           1          3     4       5     6     7       8       9           10         11        12
        int number=10;

        if (number<1||number>12){
            System.err.println("Invalid Number");
        }

      //  System.out.println(Arrays.toString(mounths));

        System.out.println(mounths[0]);
        System.out.println(mounths[1]);
        System.out.println(mounths[2]);
        System.out.println(mounths[3]);
        System.out.println(mounths[4]);
        System.out.println(mounths[5]);
        System.out.println(mounths[6]);
        System.out.println(mounths[7]);
        System.out.println(mounths[8]);
        System.out.println(mounths[9]);
        System.out.println(mounths[10]);
        System.out.println(mounths[11]);
        System.out.println("--------------------------------------");


        for (int i = 0; i <mounths.length ; i++) { //represents the index numbers of array starting from 0


            System.out.println(mounths[i]);
        }

        System.out.println("-----------------------------------------");

        for (int i =mounths.length-1; i >=0 ; i--) {   // from last element to first element 11~0   //represents the index numbers of array starting from last index

            System.out.println(mounths[i]);

        }

    }
}
