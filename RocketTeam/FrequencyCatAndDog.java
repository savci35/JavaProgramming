public class FrequencyCatAndDog {
    public static void main(String[] args) {

        String str =" dog dog dog cat dog cat dog";
     int count=0;
/*
        while (str.contains("dog")){

           str= str.replaceFirst("dog","" );
                   count++;

        }
        System.out.println(count);
*/
        System.out.println("===========================");
        while (str.contains("cat")){

            str=str.replaceFirst("cat","");
            count++;
        }
        System.out.println(count);
    }

}
