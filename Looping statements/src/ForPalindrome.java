import java.util.Scanner;

public class ForPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to know its a palndrome or not = ");
		int num=scan.nextInt();
		int r;
		int z=num;
		int sum=0;
		for(;num>0;)
		{
			r = num%10;
			sum = sum*10+r;
			num=num/10;
		}
		if (z==sum)
		{
			System.out.println("Given number is an palndrome number");
		}
		else
		{
			System.out.println("Given number is not a palndrome number");
		}
	}

}
