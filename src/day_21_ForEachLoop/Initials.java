package day_21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        String[] names ={"Savaş Altun","Ebru Altun","Barış Altun","Aslı Kacan","Nebahat Çelebi","Murat Köprülü"};
// index                  0
        for (String each : names) {
            //              ilk ismin ilk harfi                    soy ad herzaman önünde boşluk olur index aldık ver soy adın ilk harfi için bir ekledik ve sonra tüm hepsi için loop içinde döünürdük
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println("initial = " + initial);

        }
    }
}
/*
initial = S.A
initial = E.a
initial = B.A
initial = A.K
initial = N.Ç
initial = M.K

 */