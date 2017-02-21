import java.util.Scanner;
class Problem6_3{
	public static void main(String[] args){
		System.out.println(isPalindrome(101));
	}
	public static int reverse(int number){
	int r = 0;	
	while(number>0){
		r *= 10;
		r += number % 10;
		number /= 10;
	}
	return r;
	}

	public static boolean isPalindrome(int number){
	return number == reverse(number);
	}
}