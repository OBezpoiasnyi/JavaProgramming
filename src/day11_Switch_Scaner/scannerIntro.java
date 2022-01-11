package day11_Switch_Scaner;

import java.util.Scanner;

public class scannerIntro {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        //print Scan and enter for add scanner util

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num1 = input.nextInt();

        System.out.println("Enter a decimal:");

        double num2 = input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ (num1+num2));

        input.close(); //close the scanner after for save memory
    }

}
