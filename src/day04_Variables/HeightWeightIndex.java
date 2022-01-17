package day04_Variables;

public class HeightWeightIndex {


    public static void main(String[] args) {

        double height = 1.74;
        double weight = 80;

        double HeightWeightIndex = weight / (height * height);

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