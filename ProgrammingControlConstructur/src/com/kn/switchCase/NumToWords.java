package com.kn.switchCase;

import java.util.Scanner;

public class NumToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number from 0 to 9 = ");
		int num = scan.nextInt();
		numToEnglishWords(num);

	}

	private static void numToEnglishWords(int num) {
		// TODO Auto-generated method stub
		switch(num)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
		default:
			System.out.println("Enter number only from 0 to 9");
		}
		
	}

}
