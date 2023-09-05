package com.kn.ifelse;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		boolean flag = seniorCitizen(age);
		if (flag) {
			System.out.println("Your are eligible for a senior citizen discount");
		}
		else
		{
			System.out.println("Your are not eligible for a senior citizen discount");
		}
	}

	private static boolean seniorCitizen(int age) {
		// TODO Auto-generated method stub
		if (age>=60)
		{
		  return true;
		}
		else
		{
			return false;
		}
	}

}
