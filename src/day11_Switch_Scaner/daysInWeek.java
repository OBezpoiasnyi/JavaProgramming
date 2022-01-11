package day11_Switch_Scaner;

public class daysInWeek {

    public static void main(String[] args) {

        int number = 4;

        /*if(number==1){
            System.out.println("Monday");
        }
        ....*/ //or we can use switch statements like next example
        //we can`t use long,double,float and boolean in switch statements!!!

        switch(number){ //1,2,3,4,5,6,7. ==

            case 1:
                System.out.println("Monday");
                break; //exits the switch ofter executing the case block

            case 2:
                System.out.println("Tuesday");
                break; //exits the switch ofter executing the case block

            case 3:
                System.out.println("Wednesday");
                break;  //exits the switch ofter executing the case block

            case 4:
                System.out.println("Thursday");
                break;  //exits the switch ofter executing the case block

            case 5:
                System.out.println("Friday");
                break;  //exits the switch ofter executing the case block

            case 6:
                System.out.println("Saturday");
                break;  //exits the switch ofter executing the case block

            case 7:
                System.out.println("Sunday");
                break;  //exits the switch ofter executing the case block

            default:
                System.out.println("Invalid");
                //default is a not mandatory, and we do not need to print Break after last line< just } close it.

        }

    }
}
