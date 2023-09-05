package com.kodnest.practice;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age to find your are eligible for Driving License or not = ");
		int age = scan.nextInt();
		System.out.println("Enter vision out of 5 to find your are eligible for Driving License or not = ");
		int vision = scan.nextInt();
		scan.close();
		if(age>18)
		{
			if(vision==5)
			{
				System.out.println("Your are eligible for Driving License");
			}
		}
		else
		{
			System.out.println("Your are not eligible for Driving License");
		}
	}

}
