import java.util.Scanner;

	class Keypad {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a letter");
		String letter = input.nextLine();
		if ("ABCabc".contains(letter))
			System.out.println("The corresponding number is 2");
		else if ("DEFdef".contains(letter))
			System.out.println("The corresponding number is 3");
		else if ("GHIghi".contains(letter))
			System.out.println("The corresponding number is 4");
		else if ("JKLjkl".contains(letter))
			System.out.println("The corresponding number is 5");
		else if ("MNOmno".contains(letter))
			System.out.println("The corresponding number is 6");
		else if ("PQRSpqrs".contains(letter))
			System.out.println("The corresponding number is 7");
		else if ("TUVtuv".contains(letter))
			System.out.println("The corresponding number is 8");
		else if ("WXYZwxyz".contains(letter))
			System.out.println("The corresponding number is 9");
		else 
			System.out.println( letter + " is an invalid input");
	}
}