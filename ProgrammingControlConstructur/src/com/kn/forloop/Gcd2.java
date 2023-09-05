package com.kn.forloop;

import java.util.Scanner;

public class Gcd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 number to print GCD2 = ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		gcd2(num1,num2);
	}

	private static void gcd2(int num1, int num2) {
		// TODO Auto-generated method stub
		int gcd=1;
		for (int i = 1;i<=num1 && i<=num2;i++)
		{
			if( num1 % i ==0 && num2 % i ==0)
			{
				gcd = i;
			}
		}
		System.out.println(gcd);
	}

}
