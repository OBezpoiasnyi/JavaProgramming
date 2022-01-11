package day24_CustomMethods_Return;

public class ReturnStatement2 {

    public static void main(String[] args) {

        month(13);

    }

    public static void month(int numberOfMonth){

        if(numberOfMonth<1 || numberOfMonth>12){
            System.out.println("Invalid");
            return; //exits
        }


           String name = (numberOfMonth == 1)? "Jan": (numberOfMonth == 2)? "Feb": (numberOfMonth == 3)? "Mar":
                    (numberOfMonth == 4)? "Apr": (numberOfMonth == 5)? "May": (numberOfMonth == 6)? "Jun":
                    (numberOfMonth == 7)? "Jul": (numberOfMonth == 8)? "Aug": (numberOfMonth == 9)? "Sep":
                     (numberOfMonth == 10)? "Oct": (numberOfMonth == 11)? "Nov": "Dec";


        System.out.println("Month name: " + name);

    }
}
