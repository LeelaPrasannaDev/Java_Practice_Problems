package recursionProblems;

import java.util.Scanner;

public class FactorialOfGivenNumDemo {

	public static void main(String[] args) {
		// Taking input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial = ");
		int userInput = scan.nextInt();
		
		//Creating object to the present class
		FactorialOfGivenNum f = new FactorialOfGivenNum();
		
		//Calling method
		
		int result = f.fact(userInput);
		System.out.println(result);
		
		//Releasing Recourses
		scan.close();
	}

}
