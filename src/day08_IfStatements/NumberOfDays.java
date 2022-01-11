package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int number = 5;

        boolean has28Days = number == 2;
        boolean has30Days = number == 4 ||number == 6 ||number == 9 || number == 11;
        boolean has31Days = !has28Days && !has30Days && number <=12;

        if(has28Days) {//if the month have 28 days
            System.out.println("28 days");
        }

        if(has30Days){//if the month have 30 days
            System.out.println("30 days");
        }

        if(has31Days){//if the month have 31 days
            System.out.println("31 days");
        }

    }

}
