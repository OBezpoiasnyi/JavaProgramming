package day15_ForLoop;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String emt = "";
        boolean r1 = emt.isEmpty();
        System.out.println("r1 = " + r1);

        String blank;

        System.out.println("---------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2));//true //ignore upper case or lower case

        System.out.println("------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");//false
        System.out.println("hasCSharp = " + hasCSharp);

        boolean hasJava = sentence.contains("Java");//true
        System.out.println("hasJava = " + hasJava);

        boolean hasJava3 = sentence.toLowerCase().contains("java");//java with lower case
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("---------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println("----------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");//true
        System.out.println(x);
        boolean y = a.endsWith("oon");//true
        System.out.println(y);


    }
}
