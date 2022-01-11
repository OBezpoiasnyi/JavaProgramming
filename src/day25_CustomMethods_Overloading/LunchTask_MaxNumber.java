package day25_CustomMethods_Overloading;

public class LunchTask_MaxNumber {

    public static void main(String[] args) {

        short maxNumber = 0;

        short[] arr1 = {1,2,3,4,5,6,7};
        maxNumber = maxNumber(arr1);
        System.out.println(maxNumber);

    }


    public static int maxNumber(int[]arr1){

        int maxNumber = 0;

        for (int each : arr1) {
            if (each>maxNumber){
                maxNumber = each;
            }
        }

        return maxNumber;

    }

    public static double maxNumber(double[]arr1){

        double maxNumber = 0;

        for (double each : arr1) {
            if (each>maxNumber){
                maxNumber = each;
            }
        }

        return maxNumber;

    }

    public static long maxNumber(long[]arr1){

        long maxNumber = 0;

        for (long each : arr1) {
            if (each>maxNumber){
                maxNumber = each;
            }
        }

        return maxNumber;

    }

    public static short maxNumber(short[]arr1){

        short maxNumber = 0;

        for (short each : arr1) {
            if (each>maxNumber){
                maxNumber = each;
            }
        }

        return maxNumber;

    }

    public static float maxNumber(float[]arr1){

        float maxNumber = 0;

        for (float each : arr1) {
            if (each>maxNumber){
                maxNumber = each;
            }
        }

        return maxNumber;

    }

}
/*
Task 4:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array

 */
