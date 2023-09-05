package com.kodnest.practice;

import java.util.Scanner;

public class DemoIfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find it is divisable by 5 or not =");
		int num = scan.nextInt();
		if(num%5==0)
		{
			System.out.println("Given number "+num+" is divisable by 5");
		}
		else {
			System.out.println("Given number "+num+" is not divisable by 5");
		}
	}

}
