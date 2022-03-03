package practiceWihtMyBrother;

public class Frecuenc2 {
    public static void main(String[] args) {

            String str = "aaabbbccddddd";
            //a3b3c2d5


            String result = "";
            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);
                int counter = 0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == ch)
                        counter++;
                }


               if (!result.contains(ch + ""))
                    result += ch + "" + counter;

            }
            System.out.println(result);


        }

    }

