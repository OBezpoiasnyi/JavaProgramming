package day20_Arrays;

import java.util.Arrays;

public class ArraysPractices {

    public static void main(String[] args) {


        //store teh elements: 10, 20, 50 ,70
        int [] numbers = {10,20,50,70};//size4

        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------");
        //create a variable than can contain 5 scores

        int[] scores = new int[5];
        scores[1]=85;
        scores[scores.length-1] = 95;
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));

        System.out.println("---------------------------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

       /* System.out.println(month[0]);
        System.out.println(month[1]);
        System.out.println(month[2]);
        System.out.println(month[3]);
        System.out.println(month[4]);
        System.out.println(month[5]);*/

        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
        }
            System.out.println("-----------------------------------");

            for (int j = month.length-1; j >= 0 ; j--) {
                System.out.println(month[j]);

            }


    }
}
