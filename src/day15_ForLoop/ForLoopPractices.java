package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        for (int i = 15; i<=45; i++){
            System.out.print(i + " ");
        }

        System.out.println("\n-------------------------");

        for(int i = 100; i>=50; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("========================================");

        for (int i = 1; i<=55; i ++){
            //System.out.print(i + " ");//1,3,5,7,9...
            if(i%2==0){
                System.out.print(i + " ");//2,4,6,8,10...
            }
        }

    }
}
