package day_21_ForEachLoop;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        
        String[] words={"Java Programing","Cydeo School","Wooden Spoon","Early Bird","Angry Birds"};

        for (String each:words) {
            System.out.println(each.charAt(0)+""+each.charAt(each.length()-1));            //her carın bir numarası var bizbunu Stringe dönüştürmek için "" yeterli
            
        }
        
    }
}
