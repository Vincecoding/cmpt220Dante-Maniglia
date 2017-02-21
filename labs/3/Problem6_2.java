import java.util.Scanner;
class Problem6_2{
	public static void main(String[] args){
	System.out.println(sumDigits(234));
	} public static int sumDigits(long n){
		int sum = 0;
		while(n>0){
		sum += n % 10;
		n /= 10;}
		return sum;
}
}