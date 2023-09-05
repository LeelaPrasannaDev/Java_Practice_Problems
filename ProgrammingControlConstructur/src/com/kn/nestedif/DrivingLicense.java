package com.kn.nestedif;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		System.out.println("Enter your vision level between (1 to 5)= ");
		int vision = scan.nextInt();
		scan.close();
		drivingLicense(age,vision);
	}

	private static void drivingLicense(int age, int vision) {
		// TODO Auto-generated method stub
		if (age>=18)
		{
			if (vision>=5)
			{
				System.out.println("You are eligible for driving license");
			}
		}
		else
		{
			System.out.println("You are not eligible for driving license ");
		}
	}

}
