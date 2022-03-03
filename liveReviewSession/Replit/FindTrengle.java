package Replit;

import java.util.Scanner;

public class FindTrengle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int i,k;

        int sembol=1;//Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz.

        for(i=0; i<number; i++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
            for (k=0; k <sembol; k++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("*");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol++;//Yıldızımızın birer birer artmasını sağlarız.
        }



        }



    }

