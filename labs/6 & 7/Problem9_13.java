import java.util.Scanner;
public class Problem9_13{
	
	public static int[] locateLargest(double[][] a){
		
		int[] location = new int[]{0,0};
		double largest = a[0][0];
		for(int i=0; i < a.length; i++){
			for(int j=0; j < a[i].length; j++){
				if(a[i][j] > largest){
					location[0] = i;
					location[1] = j;
					largest = a[i][j];
				}
			}
		}
		
		return location;
				
	}
		
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of rows and columns");
		int numberofrows = input.nextInt();
		int numberofcolumns = input.nextInt();
		double[][] a = new double[numberofrows][numberofcolumns];
		System.out.println("Enter the array");
		for(int i = 0; i< numberofrows; i++){
			for(int j = 0; j< numberofcolumns; j++){
				a[i][j] = input.nextDouble();
			}
		}
		int[] location = locateLargest(a);
		System.out.println("The largest is located at " + location[0] + "," + location[1]);
	}
}