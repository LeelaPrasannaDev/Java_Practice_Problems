package com.kodNest.Patterns;

import java.util.Scanner;

public class HillPattern {
// for hill pattern divide into three triangles decreasing triangle two increasing triangles
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of col and rows = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=i;j<=num;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
