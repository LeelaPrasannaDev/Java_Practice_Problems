package recursionProblems;

import java.util.Scanner;

public class GcdDemo {

	public static void main(String[] args)
	{
		// taking User input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number to find Gcd = ");
		int userInput1 = scan.nextInt();
		System.out.println("Enter 2nd number to find Gcd = ");
		int userInput2 = scan.nextInt();
		//create object to this class
		Gcd g = new Gcd();
		//Calling method
		int result = g.gcd(userInput1,userInput2);
		System.out.println(result);
		//releasing resources
		scan.close();
	}

}
