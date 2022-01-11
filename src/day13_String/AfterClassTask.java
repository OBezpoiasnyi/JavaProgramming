package day13_String;

import java.util.Scanner;

public class AfterClassTask {

    public static void main(String[] args) {
//task1
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter any word");
        String word = scan.nextLine();

        int totalChars = word.length();
        char firstChar = word.charAt(0);
        char lastChar = word.charAt(totalChars-1);

        String result = (firstChar==lastChar)? "The same" : "Different";

        System.out.println("result = " + result);

        System.out.println("-------------------------------------------");
//task2
        System.out.println("Enter your first name:");
        String firstName = scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();

        String initials = ((firstName.charAt(0)) + "." + lastName.charAt(0) + ".");
        initials = initials.toUpperCase();

        System.out.println("initials = " + initials);

        System.out.println("--------------------------------------");
//task3
        System.out.println("Please print anything");
        String str = scan.nextLine();

        int charsTotal = str.length();

        char ch1 = (str.charAt(charsTotal-3));
        char ch2 = (str.charAt(charsTotal-2));
        char ch3 = (str.charAt(charsTotal-1));
        String last3 = ""+ch1+ch2+ch3;

        if(charsTotal>3){
            System.out.println(last3);
        }else if(charsTotal>0 && charsTotal<=3){
            System.out.println(str);
        }else{
            System.out.println("String is empty");
        }

        System.out.println("-------------------------------");
//task4
        System.out.println("Enter any 3 letter word:");
        String str3Letter = scan.nextLine();

        int numberOfLetter = str3Letter.length();

        if(numberOfLetter==3){
            if(str3Letter.charAt(1)=='a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        }else if(numberOfLetter<3){
            System.out.println("Word is too short");
        }else{
            System.out.println("Word is too long");
        }

        System.out.println("--------------------------");
//task5
        System.out.println("Enter 3 different words please:");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();

        int lenghtWord1 = word1.length();
        int lenghtWord2 = word2.length();
        int lenghtWord3 = word3.length();

        if(lenghtWord1==lenghtWord2 && lenghtWord1==lenghtWord3){
            System.out.println("All words are same length");
        }else if(lenghtWord1==lenghtWord2 || lenghtWord1==lenghtWord3 ||
                lenghtWord2==lenghtWord3){
            System.out.println("Not Same or Different lengths");
        }else{
            System.out.println("All different length");
        }

        System.out.println("-----------------------------------------");
//task6
        System.out.println("Cybertek log-in\n\tUserName:");
        String userName = scan.nextLine();
        System.out.println("\tPassWord:");
        String passWord = scan.nextLine();

        // correct userName and Password from database
        String correctUsername = "Cydeo";
        String correctPassWord = "WoodenSpoon";

        if(userName.equals(correctUsername) && passWord.equals(correctPassWord)){
            System.out.println("Logged in.");
        }else{
            System.out.println("Incorrect username or password");
        }

        scan.close();

    }
}
/*
1. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

2. write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output


3. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself


4. write a program that asks the user enter a three letter word.
 Check if the middle character of the given word is 'a'.
  In the case it is print: "Cool word", but in the case the middle letter is not 'a' print:
   "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"


5. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"


6. You are writing a code for the log-in function of the Cybertek Application,
 assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched,
         your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */
