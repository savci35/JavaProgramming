public class FindUniqueCharacter {
    public static void main(String[] args) {

        String str="abbbcdeess";
   String result="";

        for (int j = 0; j <str.length() ; j++) {
            char each=str.charAt(j);

            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);


                if (ch==each){
                    count++;
                }
            }
            if (count==1){
                result+=each;
            }

        }
        System.out.println("result = " + result);

    }


    }

