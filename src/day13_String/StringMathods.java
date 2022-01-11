package day13_String;

import java.util.Locale;

public class StringMathods {

    public static void main(String[] args) {

        String word = "Cydeo";
                //ind: 01234

        char firstChar = word.charAt(0);

        System.out.println("firstChar = " + firstChar);

        char secondChar = word.charAt(1);

        System.out.println("secondChar = " + secondChar);

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        char fourthChar = word.charAt(3);

        System.out.println("fourthChar = " + fourthChar);

        char tenthChar = word.charAt(4);

        System.out.println("tenthChar = " + tenthChar);

        System.out.println("------------------------------");

        //for know how many characters use ***.length();

        String s1 = "Batch 25 is the best batch.";

        int totalChars = s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(s1.length()-1);

        System.out.println("lastChar = " + lastChar);

        System.out.println("----------------------------");

        String str = "wooden spoon";
        str= str.toUpperCase();

        System.out.println("str = " + str);

        String s = "JAVA";
        s = s.toLowerCase();

        System.out.println("s = " + s);

    }
}
