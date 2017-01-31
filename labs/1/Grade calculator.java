import java.util.Scanner;

class Calculator{
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
		System.out.println("Final grade: "+final_percentage);
	}
	
}

