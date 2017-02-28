import java.util.Scanner;
class Problem7_18{
	public static void main(String[] args){
		double[] array = {5,2,3,4,5,6,7,6,2,1};
		bubbleSort(array);
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " " );
		}
	}
	
	public static void bubbleSort(double[] array) {
		for(int i=0; i<array.length-1; i++){
			for(int j=0; j<array.length-1; j++){
				if(array[j] > array[j+1]){
					double swap = array[j];
					array[j] = array[j+1];
					array[j+1] = swap;
				}
			}
		}
	}
}