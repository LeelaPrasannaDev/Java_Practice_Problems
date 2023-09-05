import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find it is palindrome or not = ");
		int num =scan.nextInt();
		int r;
		int sum=0;
		int z=num;
		while (num>0)
		{
			r =num%10;
			sum=sum*10+r;
			num=num/10;
		}
		scan.close();
		if (sum==z) {
			System.out.println("Its a palindrome nnumber");
		}
		else {
			System.out.println("Its not a palindrome number");
		}
	}

}
