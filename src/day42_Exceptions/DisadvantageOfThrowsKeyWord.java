package day42_Exceptions;

public class DisadvantageOfThrowsKeyWord {


    public static void main(String[] args) throws InterruptedException {


        System.out.println("Hello");

        sleep(2.5);

        System.out.println("Hello world");


        System.out.println("------------------------------------");


        System.out.println("Hello");

        MorningWorkOut.sleep(2.5);

        System.out.println("World");


    }



    public static void sleep(double seconds) throws InterruptedException {


            Thread.sleep( (long) (seconds * 1000) );

    }

}