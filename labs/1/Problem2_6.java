import java.util.Scanner;


public class Problem2_6{
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		int userInput = scan.nextInt();
		System.out.println(sumCalculator(userInput));
	
	
	}
	public static int sumCalculator(int Input){
		int sum = 0;
		int digit = Input%10;
		sum = sum + digit;
		Input = Input / 10;
		digit = Input%10;
		sum = sum + digit;
		Input = Input / 10;
		digit = Input%10;
		sum = sum + digit;
		Input = Input / 10;
		digit = Input%10;
		sum = sum + digit;
		Input = Input / 10;
		System.out.println("The sum of the digits is");
		return sum;
		
	}
	
	
	
	
}