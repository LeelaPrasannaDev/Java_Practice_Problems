package com.kn.switchCase;

import java.util.Scanner;

public class Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to obtain weekday(1 to 7) = ");
		int num = scan.nextInt();
		scan.close();
		weekday(num);
	}

	private static void weekday(int num) {
		// TODO Auto-generated method stub
		switch(num)
		{
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tusday");
			break;
		case 4:
			System.out.println("Wensday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		default:
			System.out.println("Saturday");
		}
	}

}
