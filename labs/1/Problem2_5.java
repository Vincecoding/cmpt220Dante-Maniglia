import java.util.Scanner;


public class Problem2_5{
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a price in");
		double userInput = scan.nextDouble();
		System.out.println(tipCalculator(userInput));
	
	
	}
	public static double tipCalculator( double basePrice){
		double totalPrice=(basePrice*1.15);
		return totalPrice;
		
	}
	
	
	
	
}