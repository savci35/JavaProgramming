public class taskRocket {
    public static void main(String[] args) {

        String sentence = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        String digits = "";
        String numbers = "";
        String letter = "";
        String specialCharacter = "";

        for (int i = 0; i <= sentence.length() - 1; i++) {

            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {

                letter += sentence.charAt(i);
            } else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
                letter += sentence.charAt(i);

            } else if (sentence.charAt(i) >= '0'&& sentence.charAt(i) <= '9') {
                numbers += sentence.charAt(i);
            } else {
                specialCharacter += sentence.charAt(i);


            }
        }

        System.out.println("letter = " + letter);

        System.out.println("numbers = " + numbers);
        System.out.println("specialCharacter = " + specialCharacter);


    }
}
/*
/*write a program that can retive the digits,
letters and special characters from a string
Ex:
input:
mn@#123Ab!

output:
letters: mnAb
digits: 123
special chars: @#!*/
