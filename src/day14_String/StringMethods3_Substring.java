package day14_String;

public class StringMethods3_Substring {
    public static void main(String[] args) {

        //substring (begining index ,ending index)


        String Word = "Cydeo School";
        //             01234567891011
        String brand = Word.substring(0, 5);      //yazdırmak istediğinin bir fazlasını yazmalısın eger (0, 4)istiyorsan (0, 5) yazmalısın
        System.out.println(brand);

String str1 =  "Cydeo School";       //we write the last sentence , write begining of careter of sentence it is enough
String str2 = str1.substring(6);
        System.out.println(str2);

        System.out.println("---------------------------------");

        String word2 = "Java programming Language";
        //              0123456789
        String s1 = word2.substring(0, word2.indexOf(" "));// "Java"
        String s2 =word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));// "programming"
       String s3 =word2.substring(word2.lastIndexOf(" ")+1); // "Language"

        System.out.println(s1);
        System.out.println(s2);
       System.out.println(s3);

    }



}
