package day_20_Array;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words={"Java","Java","C#","Python","Python"};

        for (int j = 0; j < words.length; j++) {

            String element =words[j]; //Java     // tüm indexleri gezmek için başka bir loop a ihtiyac duydum dışarıda  mesela index 0 yani java alıp aşağıdaki loop te dolaşacak
                                                // java dan başka varsa birer birer artıracak frequency ,  ve indexleri sıraile alacak aşağıdaki loop ile tekrar kontrol edecek varsa onuda birer bire artıracak

            int frequency=0;
            for (int i = 0; i < words.length; i++) { //find the frequency of element from array
                if (words[i].equals(element)){
                    frequency++;
                }

            }
            if (frequency==1){                       // sadece bir tane yani index ve last index birbirine eşit olan unique olacak

                System.out.println("element Unique= " + element);
            }

        }

    }
}
