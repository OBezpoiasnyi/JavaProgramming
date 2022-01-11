package day15_ForLoop;

import java.util.Scanner;

public class minimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");

            int number = scan.nextInt();

            if(number<min){
                min=number;
            }

        }
        System.out.println("Minimum number is " + min);




    }
}
