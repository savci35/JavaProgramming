package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";


        String digits = ""; //12345
        String letters = ""; //CydeoWoodenSpoon
        String specialCharacter = ""; //!@#$%

        for (int i = 0; i <= str.length() - 1; i++) { // i: index numbers of str (0 ~ last index )

            char ch = str.charAt(i); // ch: each character that we have in str

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {                                        //     (ch>='A'&& ch<='Z' )   diğer bir else if alt satırda upper A and Z için
                letters += ch;
            } else {
                specialCharacter += ch;
            }


        } System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialCharacter = " + specialCharacter);

    }

}
