package day20_Arrays;

import java.util.Arrays;

public class ArraysPractices2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        //letters[0] = 'A';
        //letters[0] = 'B';

        for (char i = 'A', j=0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j]=i;
        }

        System.out.println(Arrays.toString(letters));  //[A-Z]

    }
}
