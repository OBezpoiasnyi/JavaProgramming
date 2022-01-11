package day17_While_DoWhileLoop;

import java.util.Scanner;

public class yesOrNo {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Will you merry me?");
    String answer = scan.next();

        while (  !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) ){
        System.err.println("Invalid entry, please enter yes or no:");
        answer = scan.next();
    }

        if(answer.equalsIgnoreCase("yes")){
        System.out.println("Congrats!");
    }
scan.close();
}
}
