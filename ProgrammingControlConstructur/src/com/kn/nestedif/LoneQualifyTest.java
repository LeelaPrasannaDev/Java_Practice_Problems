package com.kn.nestedif;

import java.util.Scanner;

public class LoneQualifyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your occupation = ");
		String occupation = scan.nextLine();
		System.out.println("Enter your income = ");
		int income = scan.nextInt();
		loneQualify(age,occupation,income);
	}

	private static void loneQualify(int age, String occupation, int income) {
		// TODO Auto-generated method stub
		if(age>=25)
		{
			if(income>=15000)
			{
				System.out.println("Congarats You are eligible for Lone");
			}
		}
		else
		{
			System.out.println("ohhhh! You are not eligible for Lone....");
		}
		
	}

}
