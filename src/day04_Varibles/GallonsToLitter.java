package day04_Varibles;

public class GallonsToLitter {

    public static void main(String[] args) {

        int gallons = 15;
        double conversionFactor = 3.785;

        double litters = gallons * conversionFactor;

        System.out.println("gallons = " + gallons);
        System.out.println("conversionFactor = " + conversionFactor);
        System.out.println("litter = " + litters);

    }

}
