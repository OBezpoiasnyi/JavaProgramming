package day22_MultiDimensionalArray;

import java.util.Arrays;

public class forEachLoop {

    public static void main(String[] args) {

        //index of element    0 1 2    0 1 2 3    0 1  2  3  4
        int[][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} };
        //index of arrays       0          1            2

        /* for ( int[] each1DArray : arr2D){

            System.out.println(Arrays.toString(each1DArray));
        }*/

        for (int[] each1DArray : arr2D) {
            for (int eachElements : each1DArray) {
                System.out.println(eachElements);
            }
        }


    }
}
