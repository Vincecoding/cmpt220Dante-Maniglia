import java.util.Scanner;
class Problem6_8{
		public static void main(String[] args){
		for(double i = 40; i>=31; i--){
			System.out.println("celsius " + i);
			System.out.println("fahrenheit " + celsiusToFahrenheit(i));
			}
		}
		public static double celsiusToFahrenheit(double celsius){
			double Fahrenheit = (9.0 / 5) * celsius + 32;
			return Fahrenheit; 
		}
		public static double fahrenheitToCelsius(double fahrenheit){
			double Celsius = (5.0 / 9) * fahrenheit - 32;
			return Celsius;
			
		}

}