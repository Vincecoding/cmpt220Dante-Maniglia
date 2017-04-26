import java.util.Scanner;
public class Problem9_1{
	private double height;
	private double width;
	public Problem9_1(double width, double height){
		this.width = width;
		this.height = height;
	}
	public Problem9_1(){
		this.width = 50;
		this.height = 10;			
	}
	public double getArea(){
		return this.width * this.height;
	}
	public double getPerimiter(){
		return this.width + this.width + this.height + this.height;
	}
	
	public static void main(String[] args){
		
		Problem9_1 testRec = new Problem9_1(4, 40);
		Problem9_1 testRec2 = new Problem9_1(3.5, 35.9);
		
		System.out.println("Area: " +testRec.getArea());
		System.out.println("Perimeter: " +testRec.getPerimiter());
		System.out.println("Area: " +testRec.getArea());
		System.out.println("Perimeter: " +testRec.getPerimiter());
	}
}
