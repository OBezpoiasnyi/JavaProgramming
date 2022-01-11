package day11_Switch_Scaner;

public class grade {

    public static void main(String[] args) {

        char ch = 'A';
        String result ="";

        switch(ch){
            case'A': case 'B': case 'C': case 'D':
            result = "Passed";
            break;

            default: result = "Failed";
        }

        System.out.println("result = " + result);
    }
}
