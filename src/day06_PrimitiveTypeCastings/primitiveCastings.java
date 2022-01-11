package day06_PrimitiveTypeCastings;

public class primitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        int c = b;
        long d = c;

        System.out.println("a = " + a);
        System.out.println("d = " + d);

        double d1 = 20.5;
        short s1 = (short) d1;

        System.out.println("s1 = " + s1);
        System.out.println("d1 = " + d1);


    }



}
