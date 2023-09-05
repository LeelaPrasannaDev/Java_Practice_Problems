package com.kn.forloop;

import java.util.Scanner;

public class NaturalNumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = calculateSum();
		System.out.println("Sum upto given natural num = "+sum);
	}

	private static int calculateSum() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any natural number to find sum = ");
		int num = scan.nextInt();
		int sumNum=0;
		scan.close();
		for(int i =1; i<=num;i++)
		{
			sumNum = sumNum+i;
		}
		return sumNum;
	}

}
