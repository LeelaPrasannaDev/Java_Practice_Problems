package com.kn.ifelse;

import java.util.Scanner;

public class MultipleOfTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether multiple of 10 = ");
		int num = scan.nextInt();
		boolean flag = multipleOfTen(num);
		if (flag)
		{
			System.out.println("Number is multiple of 10 ");
		}
		else
		{
			System.out.println("Number is not multiple of 10");
		}
				
	}

	private static boolean multipleOfTen(int num) {
		// TODO Auto-generated method stub
		if (num%10==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
