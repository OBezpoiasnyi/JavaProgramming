package day20_Arrays;

import javax.swing.*;

public class AveregeNumber {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum +=numbers[i];
        }

        System.out.println(sum);

        double average = sum/numbers.length;

        System.out.println(average);

    }
}
