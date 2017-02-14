import java.util.Scanner;

class LetterCalculator{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the following as a percentage...");
		System.out.println("Midterm exam grade:");
		double Midterm = scan.nextDouble();
		System.out.println("Final exam grade:");
		double Final = scan.nextDouble();
		System.out.println("Project grades:");
		double Project = scan.nextDouble();
		System.out.println("homework and labs:");
		double Homework = scan.nextDouble();
		double final_percentage = (Midterm*0.2)+(Final*0.2)+(Project*0.2)+(Homework*0.4);
		if (final_percentage  >=95) {
			System.out.println("Your Final Grade is A");
		}
		else if (final_percentage >=90) {
			System.out.println("Your Final Grade is A-");
		}
		else if (final_percentage >=87) {
			System.out.println("Your Final Grade is B+");
		}
		else if (final_percentage >=83) {
			System.out.println("Your Final Grade is B");
		}
		else if (final_percentage >=80) {
			System.out.println("Your Final Grade is B-");
		}
		else if (final_percentage >=77) {
			System.out.println("Your Final Grade is C+");
		}
		else if (final_percentage >=73) {
			System.out.println("Your Final Grade is C");
		}
		else if (final_percentage >=70) {
			System.out.println("Your Final Grade is C-");
		}
		else if (final_percentage >=65) {
			System.out.println("Your Final Grade is D+");
		}
		else if (final_percentage >=60) {
			System.out.println("Your Final Grade is D");
		}
		else {
			System.out.println("Your Final Grade is F");
		}
	}

}