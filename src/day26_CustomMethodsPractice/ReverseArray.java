package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[]arr = {1,2,3,4,5};

        int[] result = reverse(arr);

        System.out.println(Arrays.toString(result));

    }


    public static int[] reverse(int[]arr){
        int[] result = new int[arr.length];

        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        return result;
    }

}
