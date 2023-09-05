import java.util.Scanner;

public class Countnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to count = ");
		int num = scan.nextInt();
		int r;
		int count =0;
		while(num>0)
		{
			r=num%10;
			count++;
			num=num/10;

		}
		System.out.print(count);
	}

}
