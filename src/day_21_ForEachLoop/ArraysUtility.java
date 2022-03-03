package day_21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};

        System.out.println(nums);                     //harscode
        System.out.println(Arrays.toString(nums));    //[1, 2, 3, 4, 5]
        System.out.println(nums[0]);                   // 1

  /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
 */


        // toString(): converts the array object (single dimensional) to string, returns string
        System.out.println("-----------------------------------------------------------------------------------------");

        // sort(): sorts the array in ascending order
        //ascending order: smallest to larget
        // 0~9
        // -10~10
        // a~z
        // A~Z

        int[] scores ={95,100,55,65,85,78};
        System.out.println(Arrays.toString(scores));  //[95, 100, 55, 65, 85, 78]  it can be written normaly

        Arrays.sort(scores); //[55, 65, 78, 85, 95, 100]  first write   Arrays.sort(scores); after then  System.out.println(Arrays.toString(scores)); ascending order: smallest to larget
        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score:"+scores[0]);                  //     bir üst satırda sıralandğı için bu şekilde çağırabildik  yardımı ile  Arrays.sort(scores);
        System.out.println("Max Score:"+scores[scores.length-1]);

        System.out.println("-------------------------------------");

        String[] names = {"Gunay", "Anna", "Zuhal", "Ahmet", "Maria", "Sinem"};

        Arrays.sort(names);                           //[Ahmet, Anna, Gunay, Maria, Sinem, Zuhal]
        System.out.println(Arrays.toString(names));


String[] words ={"Anna" ,"ANNA"};

Arrays.sort(words);                                       //[ANNA, Anna]
        System.out.println(Arrays.toString(words));

        System.out.println("-------------------------------------------------------------------------------");

                                    // equals(array1 , array2):

int[] arr1={1,3,2};
int[] arr2={1,2,3};

boolean r1 =Arrays.equals(arr1,arr2);    //false
        System.out.println(r1);

        System.out.println("-----------------------------------------------");

       Arrays.sort(arr1);  // {1,2,3}  // önce ikisinide sıraya soktuk
       Arrays.sort(arr2);  // {1,2,3}   // önce ikisinide sıraya soktuk



        boolean r2 =Arrays.equals(arr1,arr2);    //true
        System.out.println(r2);


        System.out.println("-----------------------------------------------");

        int[] arr3={1,2,3};
        int[] arr4={1,2,3};


        boolean r3 =Arrays.equals(arr3,arr4);    //true
        System.out.println(r3);

        System.out.println("-------------------------------------------------");

        // "acb" , "bac"

        char[] ch1={'a', 'c', 'b'};
        char[] ch2={'b', 'a', 'c'};

        Arrays.sort(ch1); // {a,b,c}
        Arrays.sort(ch2); // {a,b,c}

      boolean anagram =  Arrays.equals(ch1,ch2);  // true                            !!!!!!!!!!!!!!!!!!!!!!!!!!!! önemli inntervive

        System.out.println(anagram);

        System.out.println("-----------------------------------------------------------------------------------");


    }
}