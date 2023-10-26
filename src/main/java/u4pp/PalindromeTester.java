package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {
    /**
     * YOUR JAVADOC HERE
     */
    public static void execute(Scanner sc) 
    {
        /* YOUR CODE HERE */
    	boolean balls = true;
    	boolean greeft = true;
    	System.out.println("Welcome to Palindrome Tester");
    	while (balls == true)
    	{
    		greeft = true;
	    	System.out.print("Enter a phrase: ");
	    	String grift = sc.nextLine();
	    	String goop = no(grift);
	    	if (isPalindrome(goop))
	    	{
	    		System.out.println(grift + " is a palindrome");
	    	}
	    	else
	    	{
	    		System.out.println(grift + " is not a palindrome");
	    	}
	    	while (greeft)
	    	{
		    	System.out.print("Keep testing? (Y)es or (N)o: ");
		    	String poobs = sc.nextLine();
		    	if (chet(poobs))
		    	{
			    	if (poobs.equalsIgnoreCase("Y"))
			    	{
			    		balls = true;
			    		greeft = false;
			    	}
			    	else if (poobs.equalsIgnoreCase("N"))
			    	{
			    		balls = false;
			    		greeft = false;
			    	}
		    	}
	    	}
    	}
    }
    
    /**
     * YOUR JAVADOC HERE
     */
    public static boolean isPalindrome(String phrase) 
    {
        /* YOUR CODE HERE */
    	// use a while with boolean to loop a substring with the len of the phrase
    	phrase = no(phrase);
        int connor = phrase.length();
        String lept = "";
        while (connor > 0)
        {
        	String rep = phrase.substring(connor - 1, connor);
        	lept += rep;
        	connor -= 1;
        }
        if (lept.equalsIgnoreCase(phrase))
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
    private static String no(String poob)
    {
    	int fet = poob.length() -1;
    	while (fet > 0)
    	{
    		if(poob.indexOf("0") > -1)
				poob = poob.substring(0, poob.indexOf("0")) + poob.substring(poob.indexOf("0") + 1);
    		if(poob.indexOf("1") > -1)
				poob = poob.substring(0, poob.indexOf("1")) + poob.substring(poob.indexOf("1") + 1);
    		if(poob.indexOf("2") > -1)
				poob = poob.substring(0, poob.indexOf("2")) + poob.substring(poob.indexOf("2") + 1);
    		if(poob.indexOf("3") > -1)
				poob = poob.substring(0, poob.indexOf("3")) + poob.substring(poob.indexOf("3") + 1);
    		if(poob.indexOf("4") > -1)
				poob = poob.substring(0, poob.indexOf("4")) + poob.substring(poob.indexOf("4") + 1);
    		if(poob.indexOf("5") > -1)
				poob = poob.substring(0, poob.indexOf("5")) + poob.substring(poob.indexOf("5") + 1);
    		if(poob.indexOf("6") > -1)
				poob = poob.substring(0, poob.indexOf("6")) + poob.substring(poob.indexOf("6") + 1);
    		if(poob.indexOf("7") > -1)
				poob = poob.substring(0, poob.indexOf("7")) + poob.substring(poob.indexOf("7") + 1);
    		if(poob.indexOf("8") > -1)
				poob = poob.substring(0, poob.indexOf("8")) + poob.substring(poob.indexOf("8") + 1);
    		if(poob.indexOf("9") > -1)
				poob = poob.substring(0, poob.indexOf("9")) + poob.substring(poob.indexOf("9") + 1);
    		if(poob.indexOf(";") > -1)
				poob = poob.substring(0, poob.indexOf(";")) + poob.substring(poob.indexOf(";") + 1);
    		if(poob.indexOf("&") > -1)
				poob = poob.substring(0, poob.indexOf("&")) + poob.substring(poob.indexOf("&") + 1);
    		if(poob.indexOf("^") > -1)
				poob = poob.substring(0, poob.indexOf("^")) + poob.substring(poob.indexOf("^") + 1);
    		fet --;
    	}
    	poob = poob.replaceAll(" ", "");
	    return poob;
    }
    // private method to test whether a input for the continue prompt is valid
    private static boolean chet(String str) 
    {
    	if (str.equalsIgnoreCase("Y") || str.equalsIgnoreCase("N"))
    	{
    		return true;
    	}
    	else
    	{
    		System.out.println("Invalid Input, please try again");
    		return false;
    	}
    }
    /* Any helper methods you might need */
    public static void main (String[] args) 
    {
		Scanner myScanner = new Scanner(System.in);
		PalindromeTester.execute(myScanner);
		myScanner.close();
	}
}
