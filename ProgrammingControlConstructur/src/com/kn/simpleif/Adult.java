package com.kn.simpleif;

import java.util.Scanner;

public class Adult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		 boolean flag =adult(age);
		 scan.close();
		 if (flag) {
			 System.out.println("Your are Adult");
		 }
		 else {
			 System.out.println("Your are not Adult");
		 }
		
	}

	private static boolean adult(int age) 
	{
		// TODO Auto-generated method stub
		if (age>=21)
		{
		return true;}
		else
		{
			return false;
		}
	}

}
