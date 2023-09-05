import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number in positive or negative = ");
		int a = scan.nextInt();
		if (a>=0)
		{
			System.out.println("Entered number is positive "+a);
		}
		else
		{
			System.out.println("Entered number is negative "+a);
		}
	}

}
