package day14_StringMethods;

public class StringMethods1 {

    public static void main(String[] args) {
//trim()
        String str1 = "      batch    25       ";
        str1 = str1.trim(); //"batch 25" deleted white spaces(unused spaces)

        System.out.println("str1 = " + str1);

        System.out.println("--------------------------------");
//indexOf()
        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");//8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");//9
        System.out.println("n2 = " + n2);

        System.out.println("----------------------------");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");//or
        //int fourthA = s.lastIndexOf("av");//or
        int fourthA = s.indexOf("Ca")+1;
        //int fifthA = s.lastIndexOf("va")+1;//or
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");



        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);



    }

}
