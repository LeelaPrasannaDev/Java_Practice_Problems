package com.kodnest.practice;

import java.util.Scanner;

public class DemoForLoopProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print upto there = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=0;i<=num;i++)
		{
			System.out.println(i);
		}
	}

}
