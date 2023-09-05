package com.kodnest.practice;

import java.util.Scanner;

public class GivenNumIsPositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check number is positive or negative = ");
		int num = scan.nextInt();
		isNumPostiveOrNegative(num);
	}

	private static void isNumPostiveOrNegative(int num) {
		if(num<0)
		{
			System.out.println("Given number "+num+" is Negative number");
		}
		else
		{
			System.out.println("Given number "+num+" is positive number");
		}
		
	}

}
