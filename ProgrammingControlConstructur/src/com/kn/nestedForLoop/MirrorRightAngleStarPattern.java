package com.kn.nestedForLoop;

import java.util.Scanner;

public class MirrorRightAngleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter height of the mirror right angled triangle with * pattern = ");
		int num = scan.nextInt();
		scan.close();
		for(int i=0; i<num;i++)
		{
			for(int j=0; j<num-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
