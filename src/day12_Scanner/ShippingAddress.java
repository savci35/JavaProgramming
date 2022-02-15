package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);



        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your building number:");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your city name:");
        String cityName = input.nextLine();

        System.out.println("Enter your state:");
        String state = input.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your country name:");
        String countryName = input.nextLine();


        System.out.println("Full name = "+fullName);
        System.out.println("Building number = "+buildingNumber);
        System.out.println("Street name = "+streetName);
        System.out.println("City name = "+cityName);
        System.out.println("State = " +state);
        System.out.println("Zip code = "+zipCode);
        System.out.println("Country name = "+countryName);


input.close();

    }
}
/*
1. Enter your full name
2. Enter your building number
3. Enter your Street name
4. Enter your city name
5. Enter your state
6. Enter your zip code


Display the shipping address

 */