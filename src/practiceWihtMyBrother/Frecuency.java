package practiceWihtMyBrother;

public class Frecuency {
    public static void main(String[] args) {

        String str = "aaaabbbdddhhyy";
        String result="";

        for (int j = 0; j < str.length(); j++) {
            char each = str.charAt(j);
            int counter= 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i)==each){
                    counter++;

                }
            }
            if (!result.contains(each + "")) {
                result += each + "" + counter;
            }



        }
        System.out.print(result);
    }
}
