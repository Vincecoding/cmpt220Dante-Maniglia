import java.util.Scanner;
class Polygon4_5{
	public static void main(String[] args){
		System.out.println("Enter a length from the center of a polygon");
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		System.out.println("Enter a length from the side of a polygon");
		double s = input.nextDouble();
		double Area =( n * Math.pow(s,2))/(4* Math.tan(Math.PI / n));
		System.out.println("The area of the polygon is: " + Area);
		}
}