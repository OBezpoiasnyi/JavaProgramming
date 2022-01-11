package day08_IfStatements;
/*
1. write a program that can display the name of the month

            number = 1 ~ 12

    2. write a program that can display the name of the day

            number = 1 ~ 7
 */
public class nameOfTheMonth_Day {

    public static void main(String[] args) {

        int number = 6;

        boolean January = 1 == number;
        boolean February = 2 == number;
        boolean March = 3 == number;
        boolean April = 4 == number;
        boolean May = 5 == number;
        boolean June = 6 == number;
        boolean July = 7 == number;
        boolean August = 8 == number;
        boolean September = 9 == number;
        boolean October = 10 == number;
        boolean November = 11 == number;
        boolean December = 12 == number;

        if(June){
            System.out.println("Month of Summer");
        }


    }



}
