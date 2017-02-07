import java.util.Scanner;

class Calendar3_11{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a year");
		int Year=scan.nextInt();
	System.out.println("Please input a month");
		int Month=scan.nextInt();
		switch (Month) {
			case 1: System.out.println("January in the year " +Year +"has 31 days");
			break;
			case 2: if (Year %4==0){
				System.out.println("Feburary in the year " +Year +"has 29 days");
			}else {
			System.out.println("Feburary in the year " +Year +"has 28 days");
			}
			break;
			
		}
	}