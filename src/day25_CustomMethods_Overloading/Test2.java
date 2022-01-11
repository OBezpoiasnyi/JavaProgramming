package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("-------------------------");

        String [] names = {"Ali", "Oleksandr", "Katia"};

        ArraysUtility.printEachElement(names);

        System.out.println("-------------------------");

        int[] arr2 = {1,2,3,4,5};

        System.out.println(ArraysUtility.contains(arr2,5));
    }
}
