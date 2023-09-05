package com.kn.forloop;

import java.util.Scanner;

public class PowerOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter base and exponent = ");
		int base = scan.nextInt();
		int exponent = scan.nextInt();
		double result = calculatePower(base,exponent);
		System.out.println(result);
		scan.close();
	}

	private static double calculatePower(int base,int exponent) {
		// TODO Auto-generated method stub

		int power =1;
		for(int i =1;i<=exponent;i++)
			power = power * base;
		return power;
	}

}
