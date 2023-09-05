package com.kn.nestedForLoop;

import java.util.Scanner;

public class FlipRightAngleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of the triangle to print pattern = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<num-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
