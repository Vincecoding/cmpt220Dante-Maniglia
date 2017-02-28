import java.util.Scanner;
class Problem7_9{
	public static void main(String[] args){
		System.out.println("Enter ten numbers");
		Scanner scan = new Scanner(System.in);
		double[] nums= new double[10];
		for(int i=0; i<10; i ++){
			nums[i]=scan.nextDouble();
		}
		System.out.println(min(nums));
	}
	public static double min(double[] array){
		double lowest = array[0];
		for(int i=0; i<array.length; i++){
			if(array[i]<lowest){
				lowest=array[i];
			}
		}
		return lowest;
	}
}