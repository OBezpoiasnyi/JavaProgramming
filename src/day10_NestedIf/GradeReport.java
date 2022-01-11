package day10_NestedIf;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class GradeReport {

    public static void main(String[] args) {

        /*
        90 ~ 100 Excellent
        80 ~ 89 Great
        70 ~ 79 Good
        60 ~ 69 Passed
        0 ~ 59 Failed
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.next();
        System.out.println("Enter the score:");
        int score = scan.nextInt();



        if(score>=0 && score<=100){
            if(score>=90 && score<=100){
                System.out.println(name + " your result is Excellent");
            }else if(score>=80 && score<=89){
                System.out.println(name + " your result is Great");
            }else if(score>=70 && score<=79){
                System.out.println(name + " your result is Good");
            }else if(score>=60 && score<=69){
                System.out.println(name + " your result is Passed");
            }else {
                System.out.println(name + " your result is Failed");
            }
        }else{
            System.out.println("Invalid score");
        }


        System.out.println("-----------------------------");

        String result = "";

        if(score>=0 && score<=100){
            if(score>=90){
                result = "Excellent";
            }else if(score>=80){
                result = "Great";
            }else if(score>=70){
                result =  "Good";
            }else if(score>=60){
                result = "Passed";
            }else {
                result = "Failed";
            }
        }else{
            System.out.println("Invalid score");
        }

        System.out.println(result);

    }

}
