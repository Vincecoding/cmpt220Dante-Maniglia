import java.util.Random;
	class LicensePlateGenerator{
	public static void main(String[] args){
		Random variable = new Random();
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0; i<3; i++) {
			System.out.print(alphabet.charAt(variable.nextInt(alphabet.length())));
		}
		for(int i=0; i<4; i++) {
			System.out.print(variable.nextInt(10));
		}
		}
}