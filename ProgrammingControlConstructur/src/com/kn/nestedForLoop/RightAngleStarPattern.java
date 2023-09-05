package com.kn.nestedForLoop;

import java.util.Scanner;

public class RightAngleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i ;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
