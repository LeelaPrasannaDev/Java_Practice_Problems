package com.kodNest.Patterns;

import java.util.Scanner;

public class DecreaseingStarPattern {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows and columns you need to print = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
