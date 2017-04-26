import java.util.Scanner;
public class Location{
	int row = 0;
	int col = 0;
	double maxvalue;
	public Location(int row, int col, double maxvalue){
		this.row = row;
		this.col = col;
		this.maxvalue = maxvalue;
	}
	public static void main(String[] args){
		Scanner Scan = new Scanner (System.in);
		System.out.println("Please enter two numbers: ");
		int r = Scan.nextInt();
		int c = Scan.nextInt();
		double[][] array = new double[r][c];
		for(int i = 0; i<r; i++){
			System.out.println("Enter the next row");
		for(int j = 0; j<c; j++){
			array[i][j] = Scan.nextDouble();
		}
	}
		System.out.println(Location.locateLargest(array));
		
	}
	public static Location locateLargest(double[][] a){
		int r = 0;
		int c = 0;
		double l;
		l = a[0][0];
		for(int i=0; i < a.length; i++){
			for(int j=0; j < a[i].length; j++){
				if(a[i][j] > l){
					r = i;
					c = j;
					l = a[i][j];
				}
			}
		}	
		return new Location(r, c, l);
	}
	public String toString() {
		return "row: " + row +" col: " + col + " maxvalue: " + maxvalue;
	}
}