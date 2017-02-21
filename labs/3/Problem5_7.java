import java.util.Scanner;
class Problem5_7{
	public static void main(String[] args){
		double tuition = 10000;
		double totaltuition = 10000;
		for(int i = 0; i < 10; i ++){
			tuition = (tuition * 1.05);
		}
		System.out.println("The new cost of tuition after 10 years is " + tuition);
		for(int i = 0; i < 4; i ++){
			totaltuition +=  (tuition * 1.05);
			System.out.println("The tuition is " + tuition);
		}
		System.out.println("The total cost of 4 years of tuition is " + totaltuition);
	}
}