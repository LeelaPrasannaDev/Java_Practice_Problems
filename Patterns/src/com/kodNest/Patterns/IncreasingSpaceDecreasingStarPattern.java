package com.kodNest.Patterns;

import java.util.Scanner;

public class IncreasingSpaceDecreasingStarPattern { 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of columns and rows to be print = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=num;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
