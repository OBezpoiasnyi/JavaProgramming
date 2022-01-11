package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;


        if(score >=0 && score<=100){//for check valid this score or not

            if(score>=60) {
                System.out.println("Passed");//if student pass the exam
            }else {
                System.out.println("Failed");//if the student failed
            }
        }else{
            System.out.println("Invalid score");//if the score is not valid
        }

        System.out.println("--------------------------------------------");

        int age = 25;
        boolean hasId = true;

        if(hasId){//if the person has ID

            if(age>=21){//if the person is 21+
                System.out.println("Eligible to buy alcohol");
            }else{//if the person less than 21
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
            System.out.println("You must have an ID to buy alcohol");
        }

        System.out.println("------------------------------------------");

        int number = 11;

        if(number>=1 && number<=7){

            if(number==1){
                System.out.println("Monday");
            }else if(number==2){
                System.out.println("Tuesday");
            }else if(number==3){
                System.out.println("Wednesday");
            }else if(number==4){
                System.out.println("Thursday");
            }else if(number==5){
                System.out.println("Friday");
            }else if(number==6){
                System.out.println("Saturday");
            }else{
                System.out.println("Sunday");
            }

        }else {//if the number is not valid
            System.out.println("Invalid Number");
    }

    }

}
