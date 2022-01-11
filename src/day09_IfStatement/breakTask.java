package day09_IfStatement;

import java.util.Scanner;

public class breakTask {

  /*
        1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a progrm that can check if the person is eligible to buy alcohol
		4. Write a progrm that can check if the person is eligible to vote
         */

    public static void main(String[] args) {

        int num1 = 14,
            num2 = 8;

        if(num1>num2){
            System.out.println(num1 + " is the maximum number.");
        } else{
            System.out.println(num2 + " is the maximum number.");
        }

        System.out.println("------------------------------------");

        if(num1<num2){
            System.out.println(num1 + " is the minimum number");
        }else {
            System.out.println(num2 + " is the minimum number");
        }

        System.out.println("---------------------------------");
        //alcohol requirements

        String name = "Alex";
        int age = 19;

        int reqAgeForSaleAlco = 21;

        if(age>reqAgeForSaleAlco){
            System.out.println(name + " is eligible to buy alcohol");
        }else{
            System.out.println(name + " is not eligible to buy alcohol");
        }

        System.out.println("-------------------------------------------");


        System.out.println("Requirement to vote");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age1 = scan.nextInt();
        System.out.println("Do you citizen? \n yes/no");
        String citizenOrNot = scan.next();


        boolean citizen = citizenOrNot.equals("Yes") || citizenOrNot.equals("yes") || citizenOrNot.equals("YES");
        /*String name1 = "Katya";
        int age1 = 18;
        String citizenOrNot = "Yes";*/

        if(age1>=18 && citizen){
            System.out.println("You are is eligible to vote");
        }else{
            System.out.println("You are is not eligible to vote");
        }


    }

}
