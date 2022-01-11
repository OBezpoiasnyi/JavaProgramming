package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        String[] arr2 = {"Java", "Python", "C++" };
        arr2 = replace(arr2, 1, "C#");
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] replace(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static double[] replace(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static char[] replace(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}