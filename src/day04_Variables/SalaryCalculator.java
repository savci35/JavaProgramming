package day04_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        // hourlyRate, weeklyHours


        int hourlyRate = 27;
        int weeklyHourly = 28;
        int numberofweeks=52;

        int salary = hourlyRate * weeklyHourly * numberofweeks;

       // System.out.println(salary);  you can print your code like this

       System.out.println("salary = $" + salary);
        System.out.println("weeklyHourly = " + weeklyHourly);// you can also print yor code as short. write : soutv
        System.out.println("numberofweeks = " + numberofweeks);
        System.out.println("hourlyRate = $" + hourlyRate);



    }


}
