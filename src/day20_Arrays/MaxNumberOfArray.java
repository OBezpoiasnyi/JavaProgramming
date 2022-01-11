package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,15,4,20,3,35,6,3,63};
        int max = numbers[0];//10
        int minimum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i]>max){
                max=numbers[i];
            }else if(numbers[i]<minimum){
                minimum=numbers[i];
            }


        }
        System.out.println(max);
        System.out.println(minimum);

    }
}
