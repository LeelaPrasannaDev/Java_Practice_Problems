import java.util.Scanner;

public class NaturalNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to for natural numbers = ");
		int num = scan.nextInt();
		for(;num>=0; num--)
		{
		System.out.println(num);
		}
	}

}
