package com.kn.elseIfLadder;

import java.util.Scanner;

public class PositiveNegativeAndZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		integer(num);
	}

	private static void integer(int num) {
		// TODO Auto-generated method stub
		if (num==0) 
		{
			System.out.println(num+" is not postive nor negitive");
		}
		else if (num>0)
		{
				System.out.println(num + " is a positive number");
		}
		else
		{
			System.out.println(num+" is a negative number");	
		}
		
		
	}

}
