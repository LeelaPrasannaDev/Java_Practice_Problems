package com.kodnest.practice;

import java.util.Scanner;

public class CheckDivisibleNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check it is divisible by 2,3,4,5 = ");
		int num = scan.nextInt();
		scan.close();
		if(isDivisibleBy(num))
		{
			System.out.println("Given number "+num+" is divisible by 2,3,4,5");
		}
		else
		{
			System.out.println("Given number "+num+" is not divisible by 2,3,4,5");
		}
	}

	private static boolean isDivisibleBy(int num) {
		if(num%2==0 && num%3==0 && num%4==0 && num%5==0)
		{
			return true;
		}
		return false;

	}

}
