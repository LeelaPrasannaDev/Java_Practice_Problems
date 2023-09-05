import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit = ");
		double tem = scan.nextDouble();
		fahrenheitToCelsius(tem);
		double temperature = ((tem-32)*5/9);
		System.out.println("Temperature in Celsius for " + tem + " in Fahrenheit is = "+ temperature);
	}

	public static double fahrenheitToCelsius(double tem) {
		// TODO Auto-generated method stub
		return(tem);
	}

}
