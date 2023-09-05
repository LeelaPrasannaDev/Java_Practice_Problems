package com.kn.ifelse;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		boolean flag = postiveOrNegative(num);
		if (flag)
		{
			System.out.println("Given number "+num+" is an positive number");
		}
		else {
			System.out.println("Given number "+num+" is an negative number");
		}
	}

	private static boolean postiveOrNegative(int num) {
		// TODO Auto-generated method stub
		if (num>=0) {
		return true;
		}
		else
		{
			return false;
		}
	}

}
