package day11_Switch_Scaner;

public class lunchTask {

    public static void main(String[] args) {
        /*
    1. NameOfMonth  (1~12)
	2. NumberToWord (0~9)
	3. a char variable named grade is given.
	 use switch statement to print the following messages:
			'A': excellent
			'B': great job
			'C': good
			'D': passed
			'F': failed
			other wise: invalid
*/

    //task 1. NameOfMonth  (1~12)
        int number = 12;

        switch (number) { //1,2,3,4,5,6,7,8,9,10,11,12.

            case 1:
                System.out.println("Jun");
                break; //exits the switch ofter executing the case block

            case 2:
                System.out.println("Feb");
                break; //exits the switch ofter executing the case block

            case 3:
                System.out.println("Mar");
                break;  //exits the switch ofter executing the case block

            case 4:
                System.out.println("Apr");
                break;  //exits the switch ofter executing the case block

            case 5:
                System.out.println("May");
                break;  //exits the switch ofter executing the case block

            case 6:
                System.out.println("Jun");
                break;  //exits the switch ofter executing the case block

            case 7:
                System.out.println("Jul");
                break;  //exits the switch ofter executing the case block

            case 8:
                System.out.println("Aug");
                break;  //exits the switch ofter executing the case block

            case 9:
                System.out.println("Sep");
                break;  //exits the switch ofter executing the case block

            case 10:
                System.out.println("Oct");
                break;  //exits the switch ofter executing the case block

            case 11:
                System.out.println("Nov");
                break;  //exits the switch ofter executing the case block

            case 12:
                System.out.println("Dec");
                break;  //exits the switch ofter executing the case block

            default:
                System.out.println("Invalid");
                //default is a not mandatory, and we do not need to print Break after last line< just } close it.

        }

        System.out.println("-------------------------");

    //task 2. NumberToWord (0~9)
        int num1 = 3;

        switch (num1){

        case 0:
        System.out.println("Zero");
        break;

        case 1:
        System.out.println("One");
        break;

        case 2:
        System.out.println("Two");
        break;

        case 3:
        System.out.println("Three");
        break;

        case 4:
        System.out.println("Four");
        break;

        case 5:
        System.out.println("Five");
        break;

        case 6:
        System.out.println("Six");
        break;

        case 7:
        System.out.println("Seven");
        break;

        case 8:
        System.out.println("Eight");
        break;

        case 9:
        System.out.println("Nine");
        break;

        default:
        System.out.println("Invalid number");

    }

        System.out.println("---------------------------");

     //task 3. a char variable named grade is given.

        char char1 = 'A';

        switch (char1) {

            case 'A':
            System.out.println("Excellent");
            break;

            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                 System.out.println("Passed");
                 break;

            case 'E':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");


        }



    }
}
