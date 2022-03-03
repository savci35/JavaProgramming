package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")) {

            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println("frequency java= "+frequency);

 /*
 Str ="Java Java Python Python"

 Delete 1st Java:
           "Java Java Python"
 Delete 2d Java:
           "Java python"

 Delete 3rd Java:
         "  Python"
  */


        System.out.println("------------------------------------------");

        String sentence = " cat cat cat cat dog dog dog cat cat";          // kac tane cat ve kac dog var

        int countCat = 0;

        while (sentence.contains("cat")) {

            sentence = sentence.replaceFirst("cat", "");

            countCat++;
        }

        System.out.println("countCat= "+countCat);

        System.out.println("------------------------------------------");

        String s = "java java java python python python";

        int countJava = 0;
        int countPython = 0;
/*
        while (s.contains("java") || s.contains("python")){
            s =s.replaceFirst("java","");
            s= s.replaceFirst("python","");

            countJava++;
            countPython++;
        }

        System.out.println("countJava= "+countJava);
        System.out.println("countPython= "+countPython);

 */
        while (s.contains("java") || s.contains("python")) {        //kaç kez silebiliriz soru bu

            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }

            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println("countJava= "+countJava);
        System.out.println("countPython= "+countPython);
    }
}