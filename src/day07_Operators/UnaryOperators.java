package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0);  //false
        System.out.println(num2 < 0); //true

        System.out.println("------------------------");

        int a = 5;
        ++a; //pre increment: +1 right away
        System.out.println("a = " + a);

        --a;  //pre decrement: -1 right now;
        System.out.println("a = " + a);

        System.out.println("------------------------");

        int b = 100;

        System.out.println(++b); //pre increment = 101;

        int c = 100;

        System.out.println(c++); //post increment: first passes the current value, post increases the value by 1
        System.out.println("c = " + c);

        System.out.println("------------------------");

        int x = 200;

        System.out.println(--x); //=199

        int y = 200;

        System.out.println(y--); //this command for 2 step, first y=200, but then it`s will be 199;

        System.out.println("------------------------");

        int z = 45;

        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);


    }

}
