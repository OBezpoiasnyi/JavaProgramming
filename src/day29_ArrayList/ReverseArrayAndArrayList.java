package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] +=arr[i];
        }

        System.out.println(Arrays.toString(reverse));

        System.out.println("---------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        ArrayList<Integer> reverseList = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        System.out.println(reverseList);



    }

}
