package com.kn.forloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFibonacci();
	}

	private static int printFibonacci() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter nums for fibonacci series = ");
		int num = scan.nextInt();
		scan.close();
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		System.out.print(num1+" "+num2+" ");
		for(int i =3;i<=num;i++)
		{
			num3 = num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
		return  num3;
	}

}
