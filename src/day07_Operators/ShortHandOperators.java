package day07_Operators;

import javax.lang.model.SourceVersion;

public class ShortHandOperators {

    public static void main(String[] args) {

        // assighment: =
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number); //200

        String word = "Java Programming";
        System.out.println("word = " + word); //Java Programming

        word = "Wooden Spoon";
        System.out.println("word = " + word); //Wooden Spoon

        //Java see just only lastone update!

        int x = 100;

        System.out.println("x = " + x); //100
        System.out.println(x + 200); //300

        //x = x + 200; //update

        x += 200;
        System.out.println("x = " + x); //300

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1); //8.0

        double availableBalance = 1000.50;

        //deposit $300
        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance); //1300.50

        System.out.println("------------------------------");

        //withdrawing 500$
        availableBalance -=500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing $200, then depositing $400

        availableBalance -= 200; //600.50
        System.out.println("availableBalance = " + availableBalance);

        availableBalance += 400; //1000.50
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("----------------------");

        double salary = 50000.50;
        System.out.println("salary = " + salary);

        salary *= 2;
        System.out.println("salary = " + salary);

        double doge = 0.000000001;
        doge *= 10000000;
        System.out.println("doge = " + doge);

        doge /= 2;
        System.out.println("doge = " + doge);

        System.out.println("--------------------------");

        double num3 = 100;
        // %=

        num3 %= 3; //ex: 100/3=99 and 1! So % for find this 1 what left;
        System.out.println("num3 = " + num3);

        //one more ex..

        int cents = 127;
        cents %= 5;
        System.out.println("cents = " + cents); // 127/5=25 and !2! Mean 5 quoter the value of 25 cents, and 2 cents in result

    }


}
