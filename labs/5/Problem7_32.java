import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Problem7_32{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter list");
		String ListOne = input.nextLine();
		String[] ListArray = ListOne.split(" ");
		int[] list1 = new int[ListArray.length];
		for (int i = 0; i < list1.length; i++){
			list1[i] = Integer.parseInt(ListArray[i]);
		}
		partition(list1);
		
		System.out.print("After the partition, the list is ");
		for(int i =0; i <list1.length; i++){
			System.out.print(list1[i] + " ");
		}
	}

	public static int partition(int[] list){
		int pivot = list[0];
		int pivotIdx = 0;
		for (int i = 1; i < list.length; i++){
			if(list[i] <= pivot){
				int num1 = list[i];
				for (int n = i-1; n>=0; n--){
					list[n+1] = list[n];
				}
				list[0] = num1;
				pivotIdx++;
			}
		}
		
		return pivotIdx;
	}
}