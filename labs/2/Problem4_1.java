import java.util.Scanner;
class Pentagon4_1{
	public static void main(String[] args){
		//Enter a length from the center of a pentagon
		System.out.println("Enter a length from the center of a pentagon to a vertex:");
		Scanner input = new Scanner (System.in);
		double r = input.nextDouble();
		double s = 2 * r * Math.sin(Math.PI / 5);
		double Area = 5 * Math.pow(s,2)/(4 * Math.tan(Math.PI / 5));
		Area = 100 * Area;
		Area = Math.round(Area);
		Area = Area/100;
		System.out.println("The area of the pentagon is: " + Area);
		}
}