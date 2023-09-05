package com.kn.switchCase;

import java.util.Scanner;

public class vendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter code to know products from (1 to 5)= ");
		int num = scan.nextInt();
		productName(num);
	}

	private static void productName(int num) {
		// TODO Auto-generated method stub
		switch(num)
		{
		case 1:
			System.out.println("Chicken puff");
			break;
		case 2:
			System.out.println("Mutton puff");
			break;
		case 3:
			System.out.println("Veg puff");
			break;
		case 4:
			System.out.println("Mushroom puff");
			break;
		case 5:
			System.out.println("paneer puff");
			break;
		default:
			System.out.println("invalid code");
		}
	}

}
