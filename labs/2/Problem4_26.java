import java.util.Scanner;

public class Problem4_26 {
	public static void main(String[] args){
	// Create a Scanner
	Scanner input = new Scanner(System.in);
	
	// Recieve the amount
	System.out.print(
		"Enter an amount in double, for example 11.56: ");
		String amount = input.next();
		String dollars = amount.substring(0,amount.indexOf("."));
		String cents = amount.substring(1+amount.indexOf("."));
		int centsString = Integer.parseInt(cents);
		//int remainingAmount = (int)(amount * 100);
		
		//Find the number of one dollars
		
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = centsString / 25;
		centsString = centsString % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = centsString / 10;
		centsString = centsString % 10;
		
		// Find the number of nickels in the remaining amount
		int numberOfNickels = centsString / 5;
		centsString = centsString % 5;
		
		// Find the number of pennies in the remaining amount
		int numberOfPennies = centsString;
		
		// Display results
		System.out.println("Your amount " + amount + "consists of");
		System.out.println("    " + dollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters ");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + "nickels");
		System.out.println("    " + numberOfPennies + "pennies");
	}
}