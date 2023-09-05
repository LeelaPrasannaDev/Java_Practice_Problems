package com.kn.switchCase;

import java.util.Scanner;

public class RomanNumeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Roman Number to print decimal number ( 1 to 5)=  ");
		String romanNum = scan.nextLine();
		romanNumber(romanNum);
	}

	private static void romanNumber(String romanNum) {
		// TODO Auto-generated method stub
		switch(romanNum)
		{
		case "I":
			System.out.println(1);
			break;
		case "II":
			System.out.println(2);
			break;
		case "III":
			System.out.println(3);
			break;
		case "IV":
			System.out.println(4);
			break;
		case "V":
			System.out.println(5);
			break;
		default:
			System.out.println("Enter Correct roman number up to 5");
		}
	}

}
