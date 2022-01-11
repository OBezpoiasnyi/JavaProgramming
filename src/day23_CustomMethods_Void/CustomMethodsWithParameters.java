package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        //oddOrEven();  // the method demands additional info to complete this task

        oddOrEven(11);

        System.out.println("------------------------------");

        ageOfThePerson(27);

        System.out.println("------------------------------");

        printNumbers(100,200);

    }


    public static void oddOrEven(int number){//11

        if(number%2 == 0){
            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }

    }


    //create a functional that can display the age of the person
    public static void ageOfThePerson(int age){

        System.out.println(age + " years is age of the person");

    }

    public static void printNumbers(int x, int y){

        for (int i =  x; i <= y ; i++) {

            System.out.print(i + " ");
        }

    }

}
