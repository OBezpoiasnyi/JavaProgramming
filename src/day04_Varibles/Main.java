package day04_Varibles;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        //Declare 4 String variables: item1, item2, item3, report
        String item1;
        String item2;
        String item3;




        //Declare 4 double variables: price1, price2, price3, totalPrice
        double price1;
        double price2;
        double price3;
        double totalPrice;



        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE
        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();

        // CONTINUE WRITE YOUR CODE BELOW THIS LINE:
        String report = "Item1: " + item1 + " Price: " + price1 + ", " +
                "Item2: " + item2 + " Price: " + price2 + ", " + "Item3: " + item3 + " Price: " + price3 ;

        System.out.println(report);

        totalPrice = price1 + price2 + price3;

        System.out.println("Total price: " + totalPrice);











    }
}