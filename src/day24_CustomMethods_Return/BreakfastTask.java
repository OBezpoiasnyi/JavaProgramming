package day24_CustomMethods_Return;


public class BreakfastTask {

    public static void main(String[] args) {

        initials("Cydeo", "School"); //imported from another custom method initials

        System.out.println("----------------------------------------");

        domain("Cydeo@gmail.com");

        System.out.println("----------------------------------------");

        String [] emails = { "josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------------------");

        month(9);

        System.out.println("-----------------------------------------");

        dayOfWeeks(5);




    }

    //1. Create a method that can display the initials of the person

    public static void initials(String firsName, String lastName){

        String initials = firsName.charAt(0) + "." + lastName.charAt(0);
        initials= initials.toUpperCase();
        System.out.println("Initial = " + initials);

    }

    //2. Create a method that can display the domain of the email. domain(String email)

    public static void domain(String email){

        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void month(int numberOfMonth){

        String name = "";

        if(numberOfMonth >=1 && numberOfMonth<=12){

            name = (numberOfMonth == 1)? "Jan": (numberOfMonth == 2)? "Feb": (numberOfMonth == 3)? "Mar":
                    (numberOfMonth == 4)? "Apr": (numberOfMonth == 5)? "May": (numberOfMonth == 6)? "Jun":
                    (numberOfMonth == 7)? "Jul": (numberOfMonth == 8)? "Aug": (numberOfMonth == 9)? "Sep":
                    (numberOfMonth == 10)? "Oct": (numberOfMonth == 11)? "Nov": "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("Month name: " + name);

    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void dayOfWeeks(int numberOfDay){

        String name = "";

        name = (numberOfDay==1)? "Monday": (numberOfDay==2)? "Tuesday": (numberOfDay==3)? "Wednesday": (numberOfDay==4)? "Thursday":
                (numberOfDay==5)? "Friday": (numberOfDay==6)? "Saturday": (numberOfDay==7)? "Sunday": "Invalid";


        System.out.println("Today is " + name);

    }


}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */
