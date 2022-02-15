package day08_ifStatements;

public class NumOfDays2 {

    public static void main(String[] args) {
        int month=3;
        String desc="";
        if (month==2){
            desc="28 days in this month";
            System.out.println("28 days in this month");
        }
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            desc="31 days in this month";
            System.out.println("31 days in this month");
        }
        if (month==4||month==6||month==9||month==11){
            desc="30 days in this month";
            System.out.println("30 days in this month");
        }
        System.out.println("desc = " + desc);
    }
}
