package day14_StringMethods;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is van, i Love learning Java";
        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence = "Java Java Java Python Python C++ C++ C++ Python Python";
        String sentence2 = sentence.replace("Python", "")
                .replace("   ", " ");

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s2 = "Java";
        s2 = s2.replace("a", "e");
        System.out.println("s2 = " + s2);//Jeve
        s2 = s2.replaceFirst("e", "o");//Jove
        System.out.println("s2 = " + s2);


        String s3 = "C# is fun, C# is cool";
        s3 = s3.replaceFirst("C#", "Java");
        //if we have some same word, it will change only first one
        System.out.println("s3 = " + s3);


    }
}
