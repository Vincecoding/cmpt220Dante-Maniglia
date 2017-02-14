import java.util.Scanner;
class Asciicode{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		if (input >=0 && input <=127) {
			System.out.println((char)input);
		}
		else {
			(input >127) {
				System.out.println("number is not valid");
			}
		}
	}
}