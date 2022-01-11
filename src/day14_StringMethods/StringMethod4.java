package day14_StringMethods;

public class StringMethod4 {

    public static void main(String[] args) {


        String str = "Cydeo";

        String str2 = str.repeat(4);//"CydeoCydeoCydeoCydeo"

        System.out.println(str2);

        str2 = str2.repeat(50);

        System.out.println("str2 = " + str2);

        System.out.println("------------------------------------");

        System.out.println("Fady\n".repeat(15));


    }
}
