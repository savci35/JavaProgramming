package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {


String str = "Java is fun ,I love learning Java";

 String str2 = str.replace("Java","Python"); // "Java is fun ,I love learning Java"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println("---------------------------------------------");

        String email = "JonhSmith@yahoo.com";

     String email2 = email.replace("yahoo","gmail");   //   you can write like email = email.replace("yahoo","gmail");      //JonhSmith@gmail.com


        System.out.println("email = " + email);
        System.out.println("email = " + email);

        System.out.println("-------------------------------------------");

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
 String sentence2 = sentence.replace("Python","");   //"Java Java   C# C# C++ C++"
sentence2 =  sentence2.replace("   "," ");           //"Java Java C# C# C++ C++"

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        System.out.println("-------------------------------------------");

        String s = "Dog Dog Dog Dog Dog Dog";

       s= s.replace("Dog","Cat"); // "Cat ......."

        System.out.println("s = " + s);
        System.out.println("-----------------------------------------");

        String s2 = "C# is fun, C# is cool";
s2 = s2.replace(" C#"," Java");    // only an C# changed
        System.out.println("s2 = " + s2);

        System.out.println("---------------------------------------");

        String s3 = "Java";

         s3 =s3.replace("a","e");
        String    s4 =s3.replace("a","e");       // you can write like two ways
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
        System.out.println("---------------------------------------------------------------------------------------------");

        String result = "Java Java Java";

     //   result = result.replace("Java","Python");

      //  System.out.println(result);

result = result.replaceFirst("Java","Python");

        System.out.println(result);

        System.out.println("--------------------------------");

        String resultt2 = "C# is fun, C# is cool";

     /*  resultt2 =resultt2.replace("C#","Java");
        System.out.println(s5);
*/
        resultt2 = resultt2.replaceFirst("C#","Java");
        System.out.println(resultt2);

        String result3 = "Java";
     /*
        result3 = result3.replaceFirst("a","o"); //"Jova"
        System.out.println(result3);
*/
        result3 =result3.replaceFirst("va","vo");
        System.out.println(result3);
    }
}
