import java.util.Scanner;
class prj1{
	public static void main(String[] args){
		Scanner my_input = new Scanner(System.in);
		
		String firstLine = my_input.nextLine();//read the next line
		int vfirstSize = Integer.parseInt(firstLine);//change input into int
		int[] vfirst = new int[vfirstSize];//create array
		
		String secondLine = my_input.nextLine();
		int vSecondSize = Integer.parseInt(firstLine);
		int[] vSecond = new int[vSecondSize];
		
		my_input.nextLine();
		
		String fourthLine = my_input.nextLine();
		String[] vfirstElements = fourthLine.split(" ");
		for (int i = 0; i < vfirst.length; i++){
			vfirst[i] = Integer.parseInt(vfirstElements[i]);
		}
		String fifthLine = my_input.nextLine();
		String[] vSecondElements = fifthLine.split(" ");
		for (int i = 0; i < vSecond.length; i++){
			vSecond[i] = Integer.parseInt(vSecondElements[i]);
		}
		
		
		//int[] vfirst = {1, 1, 1};
		//int[] vSecond = {1, 0, 1};
		int[] cResult = new int[vfirst.length + 2];
		for(int idx = 0; idx < cResult.length; idx++){
				for(int shift = 0; shift < 3; shift++){
					try{
					cResult[idx] += vfirst[idx-shift]*vSecond[shift];
					} catch (ArrayIndexOutOfBoundsException e){
						
					}
			}
		}
		for(int i=0; i<cResult.length; i++) {
			System.out.print(cResult[i] +" ");	
		}
	}
}