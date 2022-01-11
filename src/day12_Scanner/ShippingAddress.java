package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your Building number:");
        String buildNum = input.next();

        input.nextLine();

        System.out.println("Enter your Street name:");
        String streetName = input.nextLine();

        System.out.println("Enter your City name:");
        String cityName = input.nextLine();

        System.out.println("Enter your State:");
        String state = input.next();

        System.out.println("Enter your ZipCode:");
        int zip = input.nextInt();

        System.out.println("fullName = " + fullName);
        System.out.println("buildNum = " + buildNum);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);

        input.close();
    }
}
