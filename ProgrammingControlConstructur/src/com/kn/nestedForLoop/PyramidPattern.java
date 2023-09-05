package com.kn.nestedForLoop;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pyramid height = ");
		int num= scan.nextInt();
		scan.close();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
