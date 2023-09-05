package com.kn.ifelse;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year to found out leap year or not = ");
		int year = scan.nextInt();
		boolean flag = leapyear(year);
		if(flag) {
			System.out.println("Given year "+year+" is a leap year");
		}
		else
		{
			System.out.println("Given year "+year+" is not a leap year");
		}
		
	}


	private static boolean leapyear(int year) {
		// TODO Auto-generated method stub
		if (year % 4==0 & year %100!=0 || year % 400 ==0) {
		return true;
		}
		else {
			return false;
		}
 
		}
}
