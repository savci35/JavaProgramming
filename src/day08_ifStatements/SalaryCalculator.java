package day08_ifStatements;

public class SalaryCalculator {
    public static void main(String[] args) {
int hourlyRate = 50,
    weeklyHour = 45;
double stateTaxRate= 6.5;
double federalTaxRate= 26.2;

double salaryBeforeTax= hourlyRate * weeklyHour * 52;
double stateTax= salaryBeforeTax * stateTaxRate / 100;
double federalTax= salaryBeforeTax * federalTaxRate /100;
double totalTax = stateTax + federalTax;
double salaryAfterTax= salaryBeforeTax-totalTax;

        System.out.println("salaryBeforeTax =$ " + salaryBeforeTax);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHour = " + weeklyHour);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $ " + federalTax);
        System.out.println("Net income=$"+salaryAfterTax);
    }
}
/*
 3. create a clas called SalaryCalculator.java
      3.1 declare the following variables:
      hourlyRate,weeklyHours,stateTax,federalTax

      3.2 use the given in above variables to caculate the following:
      1.salaryBeforeTax
      2.stateTax
      3.federalTax
      4.totalTax
      5.salaryAfterTax

      hint:salaryBeforeTax= hourlyRate * weeklyHour * 52

 */