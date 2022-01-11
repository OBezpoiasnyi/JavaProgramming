package day04_Varibles;

public class Rectangle {

    public static void main(String[] args) {

        double length = 8;
        double width = 9;

        double area = length * width;
        double perimeter = (width + length) * 2;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

    }

}
/*
Create a class named Rectangle, write a program that can calculate the area & perimeter of any given Rectangle
                        length
                        width

                        area = length * width
                        perimeter =  2 * (length + width)
 */