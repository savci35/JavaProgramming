package practiceWihtMyBrother;

public class ReverseNameWithWehile {
    public static void main(String[] args) {

        String name = "savaş";
        int i =name.length()-1;


        while (i >=0) {

            char ch = name.charAt(i);
            i--;
            System.out.print(ch);
        }


    }
}


