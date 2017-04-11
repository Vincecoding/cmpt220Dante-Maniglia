import java.util.Scanner; 

public class Problem8_13{
	public static void main(String[] args){
		System.out.println("Enter the number of rows and columns of the array: ");
		Scanner input = new Scanner(System.in);
		
		String Firstln = input.nextLine();
		String[] LengthArray = Firstln.split(" ");
		double[][] Array = new double[Integer.parseInt(LengthArray[0])][Integer.parseInt(LengthArray[1])];
		
		System.out.println("Enter the array:");
		for(int i = 0; i< Array.length; i++){
			String row = input.nextLine();
			String[] RowArray = row.split(" ");
			for (int j = 0; j < Array[i].length; j++){
				Array[i][j] = Double.parseDouble(RowArray[j]);
			}
		}
		
		int[] location = locateLargest(Array);
		System.out.println("The location of the largest element is at (" +location[0]+", " +location[1]+")");
	}
	public static int[] locateLargest(double[][] a){
		int[] location = new int[2];
		location[0] = 0; //row
		location[1] = 0; //column
		double max = a[0][0];
		for(int i = 0; i< a.length; i++){
			for(int j = 0; j< a[i].length; j++){
			if(a[i][j]>max){
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}	
		}
		return location;
	}
}