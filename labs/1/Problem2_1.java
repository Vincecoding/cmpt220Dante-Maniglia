import java.util.Scanner;


public class Problem2_1{
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter degree in");
		double userInput = scan.nextDouble();
		System.out.println(celsiusToFarenheit(userInput));
	
	
	}
	public static double celsiusToFarenheit( double cTemp){
		double ftemp=(9.0/5) * cTemp + 32;
		return ftemp;
		
	}
	
	
	
	
}