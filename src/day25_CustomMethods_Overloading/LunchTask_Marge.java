package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class LunchTask_Marge {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] newArr = margeTwoArrays(arr1,arr2);
        System.out.println(Arrays.toString(newArr));

        char[] arr3 = {'1','2','3','4'};
        char[] arr4 = {'5','6','7','8','9'};
        char[] newArr1 = margeTwoArrays(arr3,arr4);
        System.out.println(Arrays.toString(newArr1));

        double[] arr5 = {1.1,2.1,3.1,4.1};
        double[] arr6 = {5.1,6.1,7.1,8.1,9.1};
        double[] newArr2 = margeTwoArrays(arr5,arr6);
        System.out.println(Arrays.toString(newArr2));

        String[] arr7 = {"1","2","3","4"};
        String[] arr8 = {"A", "B", "C", "D"};
        String[] newArr3 = margeTwoArrays(arr7,arr8);
        System.out.println(Arrays.toString(newArr3));

    }


    public static int[] margeTwoArrays (int[] arr1, int[] arr2){

        int[] newArray = new int[arr1.length + arr2.length];//9

        int temp = 0;

            for (int i = 0; i < newArray.length; i++) {

                if(i<arr1.length){
                newArray[i]= arr1[i];
                }else{
                newArray[i]= arr2[temp];
                temp++;
                }
            }
        return newArray;

    }

    public static double[] margeTwoArrays (double[] arr1, double[] arr2){

        double[] newArray = new double[arr1.length + arr2.length];//9

        int temp = 0;

        for (int i = 0; i < newArray.length; i++) {

            if(i<arr1.length){
                newArray[i]= arr1[i];
            }else{
                newArray[i]= arr2[temp];
                temp++;
            }
        }
        return newArray;

    }

    public static char[] margeTwoArrays (char[] arr1, char[] arr2){

        char[] newArray = new char[arr1.length + arr2.length];//9

        int temp = 0;

        for (int i = 0; i < newArray.length; i++) {

            if(i<arr1.length){
                newArray[i]= arr1[i];
            }else{
                newArray[i]= arr2[temp];
                temp++;
            }
        }
        return newArray;

    }

    public static String[] margeTwoArrays (String[] arr1, String[] arr2){

        String[] newArray = new String[arr1.length + arr2.length];//9

        int temp = 0;

        for (int i = 0, j = arr1.length-1; i < newArray.length; i++, j++) {

            if(i<arr1.length){
                newArray[i]= arr1[i];
            }else{
                newArray[i]= arr2[temp];
                temp++;
            }
        }
        return newArray;

    }

}



/*
Task3:
	1. create a method that can merge two integer arrays.  		merger(int[] arr1, int[] arr2)

	2. create a method that can merge two double arrays.  		merge(double[] arr1, double[] arr2)

	3. create a method that can merge two char arrays.   		merge(char[] arr1, char[] arr2)

	4. create a method that can merge two String arrays.  		merge(String[] arr1, String[] arr2)

			merge()*/

/*
Task 4:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array


Task 5:
	1. create a method that can return the min number from an integer array

	2. create a method that can return the min number from double array

	3. create a method that can return the min number from long array

	4. create a method that can return the min number from short array

	5. create a method that can return the min number from float array

	6. create a method that can return the min number from byte array



Task 6:
	1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array

 */
