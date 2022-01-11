package day17_While_DoWhileLoop;

public class BranchingSteatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if(i=='C'){
                continue; // uses for skip
            }

            System.out.println(i); //A B (skip) D E

        }

        System.out.println("-------------------------------");

        for (int i = 1; i <= 10; i++) {

            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }

    }
}
