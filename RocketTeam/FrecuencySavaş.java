public class FrecuencySavaş {

    public static void main(String[] args) {

        String str="Savaşaltunsavaşaltunsavaş";
//                  0123456789
int frecuency=0;

        for (char i = 0; i <str.length()-4 ; i++) {

        String ch = str.substring(i,i+5);
            System.out.println(ch);
         if (ch.equalsIgnoreCase("Savaş"))
             frecuency++;

                 }
        System.out.print(frecuency);
    }
}
