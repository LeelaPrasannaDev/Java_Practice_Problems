package com.kn.nestedForLoop;

import java.util.Scanner;

public class ReversePyremid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter pyramid height = ");
		int num= scan.nextInt();
		scan.close();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<2*num-1;j++)
			{
				if(j>=num-1-i && j<=num-1+i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
