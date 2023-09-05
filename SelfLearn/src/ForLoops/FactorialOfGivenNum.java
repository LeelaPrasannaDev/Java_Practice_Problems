package ForLoops;

import java.util.Scanner;

public class FactorialOfGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to find out factorial = ");
		int num = scan.nextInt();
		int factorial = factorialnum(num);
		scan.close();
		System.out.println("Factorial for given number = "+factorial);
	}

	private static int factorialnum(int num) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i = 1; i<=num; i++)
		{
			fact = fact*i;
		}
		return fact;
	}

}
