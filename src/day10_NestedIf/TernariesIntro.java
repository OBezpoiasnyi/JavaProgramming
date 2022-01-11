package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n%2 == 0){
            System.out.println("Even");//String
        }else{
            System.out.println("Odd");//String
        }

        System.out.println("-----------------------------");

        String result = (n%2 == 0)? "Even" : "Odd";

        System.out.println(result);

        System.out.println("------------------------------");

        int age = 21;

        if (age>=21){
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
        }

        //or another way to write this code shortly
        String result1 = (age>=21)? "Eligible" : "Not eligible";

        System.out.println(result1);

        System.out.println("--------------------------------");

        int number = 0;

        if(number > 0){
            System.out.println("Positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }

        //or shortly way

        String result3 = (number>0)? "Positive": (number<0)? "Negative" : "Zero";

        System.out.println("result3 = " + result3);

        System.out.println("-------------------------------------");

        int numb = 1;

        String whatDay = (numb==1) ? "Monday" : (numb==2) ? "Tuesday":(numb==3)?"Wednesday":
            (numb==4)?"Thursday":(numb==5)?"Friday":(numb==6)?"Saturday": "Sunday";

        System.out.println(whatDay);



    }

}
