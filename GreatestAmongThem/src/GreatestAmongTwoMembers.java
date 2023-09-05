import java.util.Scanner;
public class GreatestAmongTwoMembers {
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int a = scan.nextInt();
		System.out.println("Enter 2nd number = ");
		int b = scan.nextInt();
		if (a>b) {
			
			System.out.println("Greatest number among two numbers is "+ a);
		}
		else {
			System.out.println("Greatest number among two numbers is "+ b);
		}
	}
}
