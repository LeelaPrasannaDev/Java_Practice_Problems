package com.kodNest.Patterns;

import java.util.Scanner;

public class ReverseHillPattern {

	public static void main(String[] args) {
		// Reverse hill Increasing space two decreasing stars
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of col and rows = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<num;k++)
			{
				System.out.print("*");
			}
			for(int l=i;l<=num;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
