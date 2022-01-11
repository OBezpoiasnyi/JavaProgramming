package day13_String;

import java.util.Scanner;

public class AfterClassTask2 {

    public static void main(String[] args) {
//task1
        Scanner scan = new Scanner(System.in);

        System.out.println("Print any 5 letter word");
        String word5Letter = scan.next();

        int wordLenght = word5Letter.length();

        if(wordLenght == 5){
            System.out.println(word5Letter);
        }else if(wordLenght>5){
            System.out.println("Too long!");
        }else{
            System.out.println("Too short!");
        }



    }
}
/*1.  Create a class called Reverse, write a program that will reverse a string.
 Your program should reverse a string only 5 characters long. If word is shorter,
  display message: "Too short!". If word is longer, display message: "Too long!".
   Otherwise, reverse this word and print out result into the console.


2. Create a class called TipCalculator, write a program for a tip calculator.
 There will be different service quality benchmarks that will determine the tip given.
  There will also the ability to calculate based on the number of people in the party
  and if there is a split of the bill or not.

		Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered:
	 (number) (each person = & in output) Check amount: (number) Service Quality:
	  (String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method


3. Create a class calledTravel. Make a cost variable to calculate how much the person
 will owe after everything.
		Ask the user if they have a valid passport (yes or no)
			If the user enters yes:
					The base cost of the ticket should be set to: 1000
            		Ask the user the country they to travel to (String, multiple word)
            		Ask the user how many bags they will take with them (byte)
                			> Each bag will add 50 to the cost
            		Ask the user how many people they will travel with (short)
                			> For each person the cost is reduced by 100. Up to a limit of 300.
            		Ask the user to Enter the name of the people they will travel with in one
            		 line, separating each name with a comma (String, multiple word)

            		Print: "Your ticket is booked to $countryName. We have charged extra for
            		 the $numberOfBags bags but you are traveling with $peopleYouTravelWith
            		  so we are giving a discount. Your total cost is $costAmount"


    		If the user enters no:
    				The base cost of the passport renewal is: 200
		            Ask the user when their passport expired(int)
		                > Each year it was expired adds 75 to the cost
        			Ask the user which country they plan to travel
		            Ask the user if they will be traveling in the next year (String - yes or no)
		                > If yes: add 100 to the cost
		                > If no: subtract 50 from the cost

        			Print: "Looks like your password has been expired for $years, but not
        			 to worry we will get it ready for you to travel to $allCountries.
        			  Your total cost has come out to $costAmount."

*/
