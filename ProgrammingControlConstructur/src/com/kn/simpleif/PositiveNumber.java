package com.kn.simpleif;

import java.util.Scanner;

public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to know if it is postive or not = ");
		int num = scan.nextInt();
		boolean flag = ispositiveNumber(num);
		scan.close();
		if (flag) {
			System.out.println("Given number "+num+" is positive");
		}
		else {
			System.out.println("Given number "+num+" is negative");
		}
	}

	private static boolean ispositiveNumber(int num) {
		// TODO Auto-generated method stub
		if (num>0){
			return true;
			}
			else {
		return false;
		}
	}

}
