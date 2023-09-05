package com.kn.nestedif;

import java.util.Scanner;

public class EnployeeBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of mounths you have been joined =  ");
		int experience = scan.nextInt();
		scan.close();
		employeeBonus(experience);
	}

	private static void employeeBonus(int experience) {
		// TODO Auto-generated method stub
		if (experience>=12)
		{
			System.out.println("You are eligible for bonus");
			if(experience>=12)
			{
				System.out.println("your bonus is = "+experience*20+"/-");
			}
		}
		else
		{
			System.out.println("you are not eligible for bonus....");
		}
	}

}
