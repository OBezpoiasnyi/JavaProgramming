package day13_String;

public class StringIntro {

    public static void main(String[] args) {

        String str1 = new String("Wooden Spoon"); //new String command for created the original data;
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon");

        boolean equal = (str1==str2) && (str3==str4); //false!!!

        System.out.println("---------------------------------");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equals(s2)); //false!!!
        // this method only check for equal just text inside value.
    }

}
