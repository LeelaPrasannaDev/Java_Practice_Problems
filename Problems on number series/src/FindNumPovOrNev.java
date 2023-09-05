import java.util.Scanner;

public class FindNumPovOrNev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find it is positive or negitive = ");
		int num=scan.nextInt();
		if (num>0) 
		{
			System.out.println("Given number "+ num+" is positive");
		}
		else {
			System.out.println("Given number"+num+"is negative");
		}
	}

}
