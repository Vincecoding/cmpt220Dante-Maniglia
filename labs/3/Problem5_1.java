import java.util.Scanner;
class Problem5_1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int positive = 0;
		int negative = 0;
		int total = 0;
		int count = 0;
		
		System.out.println("Please enter random numbers");
		int currentNum;
		while((currentNum=scan.nextInt())!=0){
			total += currentNum;
			count +=1;
			if(currentNum>0){
				positive +=1;
			}
			else if(currentNum<0){
				negative +=1;
			}
		}
		int average = 0;
		average = total/count;
		System.out.println("The total is" + total);
		System.out.println("The number of Positive numbers is" + positive);
		System.out.println("The number of Negative numbers is" + negative);
		System.out.println("The average is" + average);
	}
}