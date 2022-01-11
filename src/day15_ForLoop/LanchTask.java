package day15_ForLoop;

public class LanchTask {

    public static void main(String[] args) {

        String email = "WoodenSpoon@Gmail.com";

        //String domain = email.substring(email.indexOf("@")+1);
        //System.out.println("domain = " + domain);

        email = email.toLowerCase();
        boolean domain = email.endsWith("@gmail.com");
        System.out.println("domain \"@gmail.com\" = " + domain);



    }
}
/*1. write a program to verify if the gmail is valid
            requirements:
                    a valid gmail account should end with @gmail.com

    2. write a program that can check if the given website is valid website or not
            starts with: www.
            ends with: .com, .edu, .gov
 */
