package u4pp;

/**
* JAVADOC HERE
*/
import java.util.Scanner;

public class RockPaperScissors {

    /* ANY CODE YOU NEED HERE */
    /**
     * JAVADOC HERE
     */
    public static void play(Scanner sc) {
        /* YOUR CODE HERE */
    	// variables set up to represent player and computer wins and ties
    	int pwin = 0;
    	int cwin = 0;
    	int ties = 0;
    	boolean porp = true;
    	boolean end = true;
    	System.out.println("Welcome to Rock Paper Scissors");
    	// while loop with boolean variable will decide whether the player wants to continue or not
    	while (porp)
    	{
    		end = true;
    		System.out.print("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: ");
	    	String poop = sc.next();
	    	poop.toUpperCase();
	    	// this if should be the testing point for whether the input is valid
    		if (zoop(poop))
    		{
		    	if (poop.equalsIgnoreCase("A"))
		    	{
		    		poop = random();
		    	}
		    	String comp = random();
		    	// 
		    	//The main central tester for the winner and wins assingment
		    	int wong = results(poop, comp);
		    	if (wong == 1)
		    	{
		    		pwin += 1;
		    	}
		    	else if (wong == -1)
		    	{
		    		cwin += 1;
		    	}
		    	else
		    	{
		    		ties += 1;
		    	}
		    	System.out.println(teets(poop, comp));
		    	System.out.println("You have " + pwin + " wins and " + cwin + " losses and " + ties + " ties");
		    	// logic for input testing for the end prompt
		    	while (end)
		    	{
			    	System.out.print("Would you like to play again? (Y)es or (N)o: ");
			    	String pooper = sc.next();
			    	pooper.toUpperCase();
			    	if (goop(pooper))
			    	{
			    		if (pooper.equalsIgnoreCase("Y")) {
			    			porp = true;
			    			end = false;
			    		}
			    		else if (pooper.equalsIgnoreCase("N"))
			    		{
			    			System.out.print("Thanks for playing!");
			    			porp = false;
			    			end = false;
			    		}
			    	}
		    	}
	    	}
    	}
    }

    /**
     * JAVADOC HERE
     */
    public static int results(String playerChoice, String computerChoice) {
        /* YOUR CODE HERE */
    	// the code here should test for the logic of rockpaperscissors
    	// use x and return values rather than just always having it return a different value every time
    	int x = 0;
    	if (playerChoice.equalsIgnoreCase(computerChoice))
    	{
    		x = 0;
    	}
    	else if (playerChoice.equalsIgnoreCase("R"))
    	{
    		if (computerChoice.equalsIgnoreCase("P"))
    		{
    			x = -1;
    		}
    		else if (computerChoice.equalsIgnoreCase("S"))
    		{
    			x = 1;
    		}
    	}
    	else if (playerChoice.equalsIgnoreCase("P"))
    	{
    		if (computerChoice.equalsIgnoreCase("R"))
    		{
    			x = 1;
    		}
    		else if (computerChoice.equalsIgnoreCase("S"))
    		{
    			x = -1;
    		}
    	}
    	else if (playerChoice.equalsIgnoreCase("S"))
    	{
    		if (computerChoice.equalsIgnoreCase("R"))
    		{
    			x = -1;
    		}
    		else if (computerChoice.equals("P"))
    		{
    			x = 1;
    		}
    	}
    	return x;
    }
    // method will be the process to create a random choice for 
    // either player or the computer
    private static String random() {
    	int rat = (int) (Math.random() * 3) +1;
    	if (rat == 1)
		{
			return "R";
		}
		else if (rat == 2)
		{
			return "P";
		}
		else
		{
			return "S";
		}
    }
    // tester for whether the input is valid
    private static boolean zoop(String hilk) {
    	hilk.toUpperCase();
    	if (hilk.equalsIgnoreCase("R") || hilk.equalsIgnoreCase("P") || hilk.equalsIgnoreCase("S") || hilk.equalsIgnoreCase("A"))
    	{
    		return true;
    	}
    	else
    	{
    		System.out.println("Invalid Input, please try again");
    		return false;
    	}
    }
    // separate tester for the invalid inputs in the play again prompt
    private static boolean goop(String reps) {
    	reps.toUpperCase();
    	if (reps.equalsIgnoreCase("Y") || reps.equalsIgnoreCase("N"))
    	{
    		return true;
    	}
    	else
    	{
    		System.out.println("Invalid Input, please try again");
    		return false;
    	}
    }
    // RESULT CREATER METHOD !!!!PKEFFNJFDNJF
    private static String teets(String dud, String com)
    {
    	if (dud.equalsIgnoreCase("R")) 
    	{
    		if (com.equalsIgnoreCase("R"))
    		{
    			return "You have both picked Rock. It's a tie!";
    		}
    		else if (com.equalsIgnoreCase("s"))
    		{
    			return "You picked Rock, and the Computer picked Scissors. You win!";
    		}
    		else if (com.equalsIgnoreCase("P"))
    		{
    			return "You picked Rock, and the Computer picked Paper. You lose!";
    		}
    	}
    	if (dud.equalsIgnoreCase("P")) 
    	{
    		if (com.equalsIgnoreCase("P"))
    		{
    			return "You have both picked Paper. It's a tie!";
    		}
    		else if (com.equalsIgnoreCase("s"))
    		{
    			return "You picked Paper, and the Computer picked Scissors. You lose!";
    		}
    		else if (com.equalsIgnoreCase("R"))
    		{
    			return "You picked Paper, and the Computer picked Paper. You win!";
    		}
    	}
    	if (dud.equalsIgnoreCase("S")) 
    	{
    		if (com.equalsIgnoreCase("S"))
    		{
    			return "You have both picked Scissors. It's a tie!";
    		}
    		else if (com.equalsIgnoreCase("R"))
    		{
    			return "You picked Scissors, and the Computer picked Rock. You lose!";
    		}
    		else if (com.equalsIgnoreCase("P"))
    		{
    			return "You picked Scissors, and the Computer picked Paper. You win!";
    		}
    	}
    	return "";
    }
}
