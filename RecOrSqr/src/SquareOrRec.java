import java.util.Scanner;
public class SquareOrRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length = ");
		int length = scan.nextInt();
		System.out.println("Enter breadth = ");
		int breadth = scan.nextInt();
		if (length == breadth)
		{
			System.out.println("This is Sqare measurements");
		}
		else {
			System.out.println("This is Rectangle measurements");
		}
	}

}
