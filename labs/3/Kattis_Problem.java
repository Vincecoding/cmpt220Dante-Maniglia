import java.util.Scanner;

//(x1−x2)2+(y1−y2)2−−−−−−−−−−−−−−−−−−√
public class Kattis_Problem{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		String line = scan.nextLine();
				while(!line.equals("0")){
					//System.out.println(line);
					String[] Points = line.split(" ");
					double x1 = Double.parseDouble(Points[0]);
					double y1 =  Double.parseDouble(Points[1]);
					double x2 =  Double.parseDouble(Points[2]);
					double y2 =  Double.parseDouble(Points[3]);
					double p =  Double.parseDouble(Points[4]);
					double answer = Math.pow(Math.pow(Math.abs(x1-x2),p) +
									Math.pow(Math.abs(y1-y2),p),(1/p));
					System.out.println(answer);
					line = scan.nextLine();
				}
	}
	
}