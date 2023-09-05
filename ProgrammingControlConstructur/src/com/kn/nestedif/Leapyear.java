package com.kn.nestedif;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year to know that year is leap year or not = ");
		int year = scan.nextInt();
		boolean result = checkLeapYear(year);
		if(result) {
			System.out.println("Entered year "+year+" is a leap year");
		}
		else
		{
			System.out.println("Entered year "+year+" is not a leap year");
		}
	}

	private static boolean checkLeapYear(int year) {
		// TODO Auto-generated method stub
		if(year%4==0)
		{
			if (year%100==0) 
			{
				if(year%400==0) 
				{
					return true;
					}
					
				}
			}
		else
		{
			return false;
		}
		return true;
	
	}

}
