package com.kn.simpleif;

import java.util.Scanner;

public class DiscountApplicable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price in in dollors ($) = ");
		int price = scan.nextInt();
		boolean flag = discount(price);
		scan.close();
		if (flag) {
			System.out.println("Discount Applicable to this product");
		}
		else {
			System.out.println("Discount Not Applicable to the product ! buy more than 100$ to eligible....");
		}
	}

	private static boolean discount(int price) {
		// TODO Auto-generated method stub
		if (price>100) {
			return true;
		}
		else {
			return false;
		}
	}

}
