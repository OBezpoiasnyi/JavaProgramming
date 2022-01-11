package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = scan.nextLine();

        System.out.println("Enter your password:");
        String p = scan.nextLine();

        if (u.equals("Cydeo") && p.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {

            for (int i = 0; i < 4; i++) {
                System.out.println("Incorrect user name or password");
                System.out.println("Enter your username:");
                u = scan.nextLine();

                System.out.println("Enter your password:");
                p = scan.nextLine();

                if (u.equals("Cydeo") && p.equals("Cydeo123")) {
                    System.out.println("Logged in");
                    break;
                }
            }

                if (!(u.equals("Cydeo") && p.equals("Cydeo123"))) {
                    System.out.println("Your account is locked");
                }
            }
scan.close();
    }
}
