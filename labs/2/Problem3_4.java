import java.util.Scanner;

class Randommonths{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer between 1 and 12");
		int month = scan.nextInt();
		switch(month){
			case 1: System.out.println("January");break;
			case 2: System.out.println("February");break;
			case 3: System.out.println("Mar");break;
			case 4: System.out.println("Apr");break;
			case 5: System.out.println("May");break;
			case 6: System.out.println("June");break;
			case 7: System.out.println("July");break;
			case 8: System.out.println("Aug");break;
			case 9: System.out.println("Sep");break;
			case 10: System.out.println("Oct");break;
			case 11: System.out.println("Nov");break;
			case 12: System.out.println("Dec");break;
			default: System.out.println("You didn't enter a valid number!");break;
			
		}
			int count = 0;
			while(count < month){
				System.out.println(count);
				count++;
			}
		
	}
}

