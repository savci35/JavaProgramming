package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
/*
        String name = "Savaş",
        buildNumber = "123A",
         streetName = "Dumlupınar",
        city = "Kocaeli",
         state = "Türkiye",
        zipCode = "41000";

        System.out.println("name = " + name);
        System.out.println("buildNumber = " + buildNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);

*/


     String name = "Savaş",buildNumber = "123A" ,streetName = "Dumlupınar",city ="Kocaeli",state ="Türkiye",zipCode = "41000";
   //  You can declare something like above

        String address = name + "\n" + buildNumber + " " + streetName + " " + city + "\n" + state + " " + zipCode;
        System.out.println("address = " + address);


    }
}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
*/