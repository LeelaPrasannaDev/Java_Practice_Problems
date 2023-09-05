package com.kn.forloop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long fact = calculateFactorial();
		System.out.println("Factorial for given num = "+fact);
	}

	private static long calculateFactorial() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num to find factorial = ");
		int num = scan.nextInt();
		int intialFact=1;
		scan.close();
		for(int i =1; i<=num;i++)
		{
			intialFact = intialFact*i;
			
		}
		return intialFact;
	}

}
