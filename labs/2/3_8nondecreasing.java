import java.util.Scanner;

class 3_8nondecreasing{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input an interger");
		int number1=scan.nextInt();
		System.out.println("Please input an interger");
		int number2=scan.nextInt();
		System.out.println("Please input an interger");
		int number3=scan.nextInt();
		if (number1>number2){
			int t=number2;
			number2=number1;
			number1=t;
		}
		if (number2>number3){
			int t=number3;
			number3=number2;
			number2=t;
		}
	System.out.println(number1+" "+ number2 + " "+ number3);
	}
	
}