import java.util.Scanner;
class Problem5_13{
	public static void main(String[] args){
		int n = 1;
		while(n * n * n <= 12000){
			n ++;
		}
		n = n-1;
		System.out.println(n);
	}
}