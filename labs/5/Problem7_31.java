import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Problem7_31{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter list 1");
		String ListOne = input.nextLine();
		String[] ListArray = ListOne.split(" ");
		int[] list1 = new int[ListArray.length];
		for (int i = 0; i < list1.length; i++){
			list1[i] = Integer.parseInt(ListArray[i]); 
		}
		/*
		String fourthLine = my_input.nextLine();
		String[] vfirstElements = fourthLine.split(" ");
		for (int i = 0; i < vfirst.length; i++){
			vfirst[i] = Integer.parseInt(vfirstElements[i]);
		}
		*/
		
		
		System.out.println("enter list 2");
		String ListTwo = input.nextLine();
		String[] ListArray2 = ListTwo.split(" ");
		int[] list2 = new int[ListArray.length];
		for(int i = 0; i < list2.length; i++){
			list2[i] = Integer.parseInt(ListArray2[i]);
		}
		
		int[] mergedArray = merge(list1,list2);
		System.out.print("The merged list is ");
		for(int i =0; i <mergedArray.length; i++){
			System.out.print(mergedArray[i] + " ");
		}
	} 
	public static int[] merge(int[] list1,int[] list2){
		int[] outputArray = new int[list1.length + list2.length];
		int list1index = 0;
		int list2index = 0;
		
		for(int i =0; i <outputArray.length; i++){
			if(list1index == list1.length){
				outputArray[i] = list2[list2index];
				list2index++;
			//	System.out.print(list1index);
			}
			else if(list2index == list2.length){
				outputArray[i] = list1[list1index];
				list1index++;
				//System.out.print(list2index);
			}
			else if(list1[list1index] < list2[list2index]){//pick from list1
				outputArray[i] = list1[list1index];
				list1index++;
			}
			else{
				outputArray[i] = list2[list2index];
				list2index++;
			}
			
		}
		
		
		
		return outputArray;
		
	}
}