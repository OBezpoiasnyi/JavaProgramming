package day18_NestedLoop;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 30;
        int b = 7;
        int result = 0;

        while (a>=b){
            a-=b;
            result++;
        }
        System.out.println(result);
    }
}
