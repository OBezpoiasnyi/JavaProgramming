package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Sasha";
        myGroup[4] = "Katia";

        //System.out.println(myGroup);//wrong way, its shows hashcode
        System.out.println(Arrays.toString(myGroup));//we need to add 5 name.

        System.out.println("---------------------------------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//                           0         1           2           3          4           5          6
        System.out.println(Arrays.toString(days));

        int number = 3;

        if(number<1 || number >7){
            System.err.println("Invalid number");
            System.exit(0);
        }

        System.out.println(days[number-1]);



    }
}
