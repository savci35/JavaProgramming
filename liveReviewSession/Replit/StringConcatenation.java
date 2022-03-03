package Replit;

public class StringConcatenation {

    public static void main(String[] args) {

        String str = "AB1CD4EF5";
        String result = "";
int A='A';
        System.out.println(A);
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)>='A'&& str.charAt(i)<='Z'){

                result+=""+str.charAt(i);

            }

        }

        System.out.println(result);
    }
}
