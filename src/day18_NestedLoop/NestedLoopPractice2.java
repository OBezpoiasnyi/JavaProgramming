package day18_NestedLoop;

public class NestedLoopPractice2 {

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {


        for (int i = 0; i < 10; i++) {
            System.out.print("* ");
        }
        System.out.println();
        }

        System.out.println("--------------------------------");



    }
}
/*
     1. Print the following shape by using a nested Loop:
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *

     2. Write a program that asks user to enter a number , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
                if user enters yes, repeat the previous steps
                if user enters no, print nothing

                If user enters invalid answer, repeat the previous steps
 */
