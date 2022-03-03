import java.util.Locale;

public class FullName {
    public static void main(String[] args) {

        String firsName="EbRU";
        String secondName="AlTuN";

       firsName= firsName.substring(0,1).toUpperCase()+firsName.substring(1).toLowerCase();

       secondName=secondName.substring(0,1).toUpperCase()+secondName.substring(1).toLowerCase();

        System.out.println("firsName = " + firsName);
        System.out.println("secondName = " + secondName);


        System.out.println("-----------------------------------");
      firsName=firsName.toUpperCase()+" "+secondName.toUpperCase();
        System.out.println(firsName);

        System.out.println("--------------------------------");
        String str= "Savaş Altun";


        for (int i = str.length()-1; i >=0; i--) {
          char ch= str.charAt(i);
            System.out.print(ch);
        }





    }

}
