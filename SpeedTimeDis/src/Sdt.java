import java.util.Scanner;

public class Sdt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Speed  m/sec = ");
		double speed = scan.nextDouble();
		System.out.println("Enter Time in sec = ");
		double time = scan.nextDouble();
		calculateDistance(speed,time);
		double distances = speed * time;
		System.out.println("Distance in meters = "+distances);
	}

	 static double calculateDistance(double speed, double time) {
		// TODO Auto-generated method stub
		return(speed*time);
	}

}
