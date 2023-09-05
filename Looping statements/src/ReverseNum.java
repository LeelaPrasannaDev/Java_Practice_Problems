import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print reverse = ");
		int num = scan.nextInt();
		int r;
		while(num>0)
		{
			r=num%10;
			System.out.print(r);
			num=num/10;
		}
		scan.close();
	}

}
