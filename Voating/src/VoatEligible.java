import java.util.Scanner;

public class VoatEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age = ");
		int age = scan.nextInt();
		if(age>=18)
		{
			System.out.println("Your are eligible for voating");
		}
		else
		{
			System.out.println("Your not eligible for Voating");
		}
	}

}
