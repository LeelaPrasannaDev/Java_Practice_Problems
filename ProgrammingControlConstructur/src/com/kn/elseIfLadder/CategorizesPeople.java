package com.kn.elseIfLadder;

import java.util.Scanner;

public class CategorizesPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Age =  ");
		int age = scan.nextInt();
		categorizesPeople(age);
	}

	private static void categorizesPeople(int age) {
		// TODO Auto-generated method stub
		if (age>=0 && age<=12)
		{
			System.out.println("Your are child ");
		}
		else if(age>=13 && age<=19)
		{
			System.out.println("Your are Teen");
		}
		else if (age>=20 && age<=59)
		{
			System.out.println("Your are Adult");
		}
		else
		{
			System.out.println("Your are Senior");
		}
		
	}

}
