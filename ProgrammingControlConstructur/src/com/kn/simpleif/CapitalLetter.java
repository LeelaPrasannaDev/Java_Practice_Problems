package com.kn.simpleif;

import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any char = ");
		char c = scan.nextLine().charAt(0);
		boolean flag = captialLetter(c);
		scan.close();
		if (flag)
		{
			System.out.println("Capital Letter");
		}
		else
		{
			System.out.println("Not Capital Letter");
		}
	}

	private static boolean captialLetter(char c) {
		// TODO Auto-generated method stub
		if(c>='A' && c<='Z')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
