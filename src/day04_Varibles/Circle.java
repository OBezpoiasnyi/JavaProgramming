
package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 5.5;
        double diameter = radius * 2;
        double area = PI * radius * radius;
        double perimeter = PI * diameter;

        System.out.println("PI = " + PI);
        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }
}

/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
 */