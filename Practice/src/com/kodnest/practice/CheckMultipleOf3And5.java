package com.kodnest.practice;

import java.util.Scanner;

public class CheckMultipleOf3And5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check multiple of 3 and 5 = ");
		int num = scan.nextInt();
		scan.close();
		
		if(isMultipleof(num))
		{
			System.out.println("Given number "+num+" is multiple of 3 and 5");
		}
		else {
			System.out.println("Given number "+num+" is not a multiple of 3 and 5");
		}
	}

	private static boolean isMultipleof(int num) {
		if(num%3==0 && num%5==0) {
			return true;
		}
		return false;
		
	}

}
