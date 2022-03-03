package day04_Variables;

import java.util.Scanner;

public class HeightWeightIndex {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yor height");
        double height = scan.nextDouble();
        System.out.println("Enter yor weight");
        double weight = scan.nextDouble();


        double HeightWeightIndex = weight/ (height * height);

        if (HeightWeightIndex > 40) {
            System.out.println("you are morbid obese");

        } else if (HeightWeightIndex > 30 && HeightWeightIndex < 39.9) {
            System.out.println("you are obese");

        } else if (HeightWeightIndex > 25 && HeightWeightIndex < 29.9) {
            System.out.println(" you are extra weight");

        } else if (HeightWeightIndex > 18.5 && HeightWeightIndex < 24.5) {
            System.out.println(" you are normal weight");
        } else {
            System.out.println(" you are weak");
        }




        System.out.println("weight =kg " + weight);
        System.out.println("height =m " + height);
        System.out.println("HeightWeightIndex = " + HeightWeightIndex);


    }
}
/*
      if you want to calculate your HeightWeightIndex :)

if you are under 18.5 kg/m  you are weak
if you are between 18.5 kg/m and 24.5 kg/m  you are normal weight
if you are between 25 kg/m and 29.9 kg/m    you are extra weight
if you are between 30 kg/m and 39.9 kg/m    you are obese
if you are over 40 kg/m   you are morbid obese

 */