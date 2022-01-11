package day14_StringMethods;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "WoodenSpoon@gmail.com";
        String domain = email.substring(email.indexOf("@")+1, email.indexOf("."));

        System.out.println("domain = " + domain);

        System.out.println("------------------------------------");

        String str1 = "Java is fun, Java is cool, I love Java";
        //             01234567891011
        String s1 = str1.substring(0, 10+1); // Java is fun
        System.out.println("s1 = " + s1);

        int beg = str1.indexOf(" J") + 1;//13
        int end = str1.lastIndexOf(",");

        System.out.println("beg = " + beg);
        System.out.println("end = " + end);
        String s2 = str1.substring(beg,end);//Java is cool
        System.out.println("s2 = " + s2);

        String s3 = str1.substring(  str1.lastIndexOf("I"));

        System.out.println("s3 = " + s3);

    }
}
