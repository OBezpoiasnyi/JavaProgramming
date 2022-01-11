package day09_IfStatement;

public class MedianNumber {

    public static void main(String[] args) {

        int     a=1000,
                b=20,
                c=3000;
        //If we have 3 different numbers, one MUST be min, 1 - max, and 1 median.

                        //a=15,b=10,c=20 or a=15,c=10,b=20
        boolean aIsMedian = (a>b && a<c) || (a>c && a<b);
                        //b=15,a=20,c=10 or b=15,a=10,c=20
        boolean bIsMedian = (b>c && b<a) || (b>a && b<c);

        boolean cIsMedian = !aIsMedian && !bIsMedian;

        if(aIsMedian) {//if a is the median number
            System.out.println(a + " is the median number");
        }
        /*
        in order for a to be a medium number:
            1.If c is the maximum number & b is the minimum number, than a is the median number
            2.If b is the maximum number & c is the minimum number, than a is the median number
         */

        if(bIsMedian) {//if b is the median number
            System.out.println(b +" is the median number");
        }

        if(cIsMedian) {//if c is the median number
            System.out.println(c +" is the median number");
        }

    }

}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */
