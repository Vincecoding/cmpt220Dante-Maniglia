import java.util.Scanner;
class Problem7_20{
	public static double[] selectionSort(double[] list){
		for (int i = list.length - 1; i >= 0; i--){
			// Find the minimum in the list
			double currentMax = list[i];
			int currentMaxIndex = i;
			
			for (int j = i - 1; j >= 0; j--){
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
		return list;
	}
	public static void main(String[] args){
		double input[]= {2.0, 4.0, 2.0, 5.0, 6.0, 7.0, 9.0};
		double result[]= selectionSort(input);
		for (int i=0; i<result.length; i++){
			System.out.println(result[i]);
		}
	}
}