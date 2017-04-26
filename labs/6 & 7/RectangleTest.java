import java.util.Scanner;
public class RectangleTest{

	public static void main(String[] args){
		
		Problem9_13 testRec = new Problem9_13(4, 40);
		Problem9_13 testRec2 = new Problem9_13(3.5, 35.9);
		
		System.out.println("Area: " +testRec.getArea());
		System.out.println("Perimeter: " +testRec.getPerimiter());
		System.out.println("Area: " +testRec.getArea());
		System.out.println("Perimeter: " +testRec.getPerimiter());
	}
}