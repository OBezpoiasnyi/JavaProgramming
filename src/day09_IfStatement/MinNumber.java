package day09_IfStatement;

public class MinNumber {
    /*
    1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number

2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
     */

    public static void main(String[] args) {

        int n1 = 200,
                n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2<n1;
        boolean equal = n1 == n2;

        if(n1IsMin) {
            System.out.println(n1+" is the minimum number");
        }

        if(n2IsMin) { //if n2 is the minimum number
            System.out.println(n2+ " if the minimum number");
        }

        if(equal){//if n1 is equal to n2
            System.out.println("Equal");
        }

    }

}
