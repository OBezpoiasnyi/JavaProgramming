package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <,<=

        boolean result1 = 200 >40; //true
        System.out.println("result1 = " + result1); //true

        boolean result2 = 300>=300;
        System.out.println("result2 = " + result2); //true

        //credit score of 720
        int creditScore = 745;

        boolean isAligibleForLoan = creditScore >= 720;
        System.out.println("isAligibleForLoan = " + isAligibleForLoan);

        boolean result3 = 100<200; //true
        boolean result4 = 200<100; //false

        int score = 59;
        boolean hasFailed = score <=59;
        //                     59 <=59
        System.out.println("hasFailed = " + hasFailed);

        System.out.println("-------------------------------");

        boolean result7 = 100==100; //true
        System.out.println("result7 = " + result7);

        boolean result8 = "Java" == "Java"; //true
        boolean result9 = "Java" == "java "; //false

        System.out.println("result8 = " + result8);
        System.out.println("result9 = " + result9);

        System.out.println("--------------------------------");
        //!= not equal

        boolean result11 = 100 != 200; //true
        boolean result12 = 100 != 100; //false

        System.out.println("result11 = " + result11);
        System.out.println("result12 = " + result12);


    }
}
