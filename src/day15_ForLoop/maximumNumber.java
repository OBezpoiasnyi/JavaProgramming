package day15_ForLoop;

import java.util.Scanner;

public class maximumNumber {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int maxNumber = -2147483648;


        for (int i = 0; i < 5; i++) {

            int number = scan.nextInt();
            maxNumber = (number > maxNumber)? maxNumber=number: maxNumber
            ;
        }

        System.out.println(maxNumber);


scan.close();
    }
}
