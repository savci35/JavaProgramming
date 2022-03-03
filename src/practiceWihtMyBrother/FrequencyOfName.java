package practiceWihtMyBrother;

public class FrequencyOfName {
    public static void main(String[] args) {

        String name= "savaş barış savaş barış ahmet savaş";


        int counter=0;

        while (name.contains("savaş")){

            name=name.replaceFirst("savaş","");

            counter++;
        }
        System.out.println(counter);

        }


    }

