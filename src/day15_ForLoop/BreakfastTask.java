package day15_ForLoop;

import java.util.Scanner;

public class BreakfastTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        char ch = word.charAt(0);

        if(ch=='x'){
            word = word.replaceFirst("x", "a");

        }

        System.out.println("word = " + word);

        System.out.println("---------------------------------");

        String str = "xcodeX";

        String result1 = str.replace("x", "a").replace("X", "a");

        System.out.println("result1 = " + result1);

        System.out.println("----------------------------------");

        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        firstName = firstName.toLowerCase();
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        lastName = lastName.toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);



    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x,
 replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex

2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        code

3. Write a program that asks user to enter first and last names,
 and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School
 */