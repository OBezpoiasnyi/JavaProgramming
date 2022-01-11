package day10_NestedIf;

public class WeekendsPractice {

    public static void main(String[] args) {

        //1 task, campus time

        int time = 8;

        String openOrClose = (time>=1)&&(time<=24)? (time>=8&&time<=23)? "Open" : "Close" : "Invalid time";

        System.out.println("openOrClose = " + openOrClose);

        System.out.println("--------------------------------------------");

        //task 2 Salary after tax

        double salary = 135000;
        boolean marriedOrno = false;
        double tax;
        double taxIfMarried;
        double salaryAfterTax;

        tax = (salary>=130000)? salary*0.35 : (salary>=100000)? salary*0.30 :
                        (salary>=80000)? salary*0.25 : salary*0.20;

        System.out.println("tax = " + tax);

        taxIfMarried = (marriedOrno)? tax*0.95 : tax;

        System.out.println("taxIfMarried = " + taxIfMarried);

        salaryAfterTax=salary-taxIfMarried;

        System.out.println("salaryAfterTax = " + salaryAfterTax);

        System.out.println("---------------------------------");

        //task3 FINRA

        int num = 15;

        String outPut = "";

       outPut = (num%3==0)&&(num%5==0)? "FINRA": (num%3==0)? "FIN": (num%5==0)? "RA" : "Error";
        System.out.println("outPut = " + outPut);

        System.out.println("--------------------------------------------------------");

        //task4 tank level

        int tankLevel = 80;

        String oxygen = (tankLevel>=90)? "Your tank is full":  (tankLevel<=80)? "Still okay":
                (tankLevel<=70)? "Don't go too far": (tankLevel<=60)? "Start to head back":
                        "Be careful now you at at 50%";

        System.out.println("Your oxygen level = " + oxygen);



    }
}
/*
1.  Create a class called CampusTime, an integer variable named time is given with a
 number between 1~24 has been initialized, write a program that can find out if the
 campus is open or not. Campus is open from 8 am(8) to 11 pm (23) If user enters a
 time within the open time they should see message: “open”  but if the time entered
 is outside of operating hours they should see: “ closed”

2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax

3. Create a class called FINRA, Write a function which prints out the number.
 but for number which is a multiple of 3, print "FIN" instead of the number
  and for number which is a multiple of 5, print "RA" instead of the number.
   and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                  output:
                      FIN

                number = 10
            output:
                RA

                number = 15
            output:
                FINRA

4. Create a class called OxygenTank. You are diving in the ocean.
 Your oxygen tank has a certain level (number) and you must print
  a message based on the level:
                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY
 */