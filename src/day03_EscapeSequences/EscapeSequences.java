package day03_EscapeSequences;

/*
        \n Newline Advances the cursor to the next line for subsequent printing
        \t Horizontal Tab Causes the cursor to skip over to the next tab stop
        \\ Backslash Causes a backslash to be printed
        \" Double quote Causes a double quotation mark to be printed
 */


public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Java \nPython \nC#");

        System.out.println("----------------------");

        System.out.println("Hello Cydeo " +
                " \nHow are you all today?" +
                " \nIt`s nice to see you all!" +
                " \nWhat class do we have next week?");
        //comand for start new line

        System.out.println("-----------------------");

        System.out.println("\tJava is Cool Programming Language");
        //comand for make a tab

        System.out.println("------------------------");

        System.out.println("\\");
        //comand for print just 1 \ in result

        System.out.println("-------------------------");

        System.out.println("\"");
        //comand for print "

    }


}
