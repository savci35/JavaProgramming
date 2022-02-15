package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
/*
        String email = " Cydeo.School@gmail.com";

        email = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));

        System.out.println(email);
        System.out.println("-------------------------------------");

        String email2 = "School.Cydeo@yahoo.com";

        email2 = email2.substring(email2.indexOf("@")+1,email2.lastIndexOf("."));

        System.out.println(email2);
*/
                    // domain
        String email = " Cydeo.School@gmail.com";

int beginningIndex = email.indexOf("@") + 1 ;
int endingIndex = email.lastIndexOf(".");

String domain = email.substring(beginningIndex,endingIndex);

        System.out.println(domain);


        System.out.println("------------------------------------------");

        String str1 = "Java is fun, Java is cool";
        //             0123456789
/*
            str1 = str1.substring(0, 10+1);
           System.out.println(str1);

 */
                                                        //   they are the same code

        String s1 = str1.substring(0, 10+1);
        System.out.println(s1);




        int beg = str1.lastIndexOf("J");

        String s2 = str1.substring(beg); // Java is cool
        System.out.println(s2);















    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a
valid email is given)
Ex:
email = Cydeo.School@gmail.com
output:
gmail
email = "School.Cydeo@yahoo.com
output:
yahoo
 */