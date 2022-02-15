package day08_ifStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 19;                                                             /* note for &&
                                                                                   false && false == false
                                                                                   false && true == false
                                                                                   true  && false == false
                                                                                   true  && true == true

                                                                                  */
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";
        //                   19>=18    "UK" =="USA"
        //                     true        false ====> false
        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("---------------------------------------------");
        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
int income =4000;
        boolean isEligible2 = creditScore>= 700 && age2 >= 21 && income>=7000;
             /*                         true  &&     true    &&   false all of the result mast bu the same for true
       a result in results is false  the last result is folse at output

              */
         System.out.println(name2+" is eligible for loan :"+isEligible2);
                                                                                    /* note  for ||
                                                                                     false  || false == false
                                                                                     true  || true == true
                                                                                     true  || false ==true
                                                                                     false || true == true
                                                                                     */
        System.out.println("-----------------------------------");

        String name3= "adam";
        int age3 = 2;
        char gender = 'F';

        Boolean isEligible3= age>=18 && (gender=='F' || gender=='M');
        //                    true    && ( true    || false)
        //                     true  &&   true    == the result is true

        System.out.println("isEligible3 = " + isEligible3);

        System.out.println("-------------------------------------------------------");
        String name4 ="James";
        String coutryOfBirth = "UK";
                boolean marriedToCitizen = false;

  boolean isEligible4 =coutryOfBirth =="USA" || marriedToCitizen==true;
   //                     false               || false
        System.out.println(name4 +" is eligible to apply for US citizenShip:"+isEligible4);
        System.out.println("------------------------------------------------");

        String student = "Brea";
         double gpa = 2.5;
         int familyIncome = 50000;
         boolean isEligieble5 =gpa>=3.5 || familyIncome <= 60000;
        System.out.println("isEligieble5 = " + isEligieble5);
        System.out.println("------------------------------------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
boolean result3 = !result2;
        System.out.println("result3 = " + result3);
        System.out.println("-------------------------------------------------------");
        int score =55;
        boolean passed = score >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);











    }
}
