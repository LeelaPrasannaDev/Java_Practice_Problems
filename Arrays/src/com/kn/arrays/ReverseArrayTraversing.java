package com.kn.arrays;

import java.util.Scanner;

public class ReverseArrayTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration
		int a[];
		//Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array length = ");
		a=new int[scan.nextInt()];
		//Array initialization
		for (int i=0;i<a.length;i++) 
		{
			System.out.println("Enter element = ");
			a[i]= scan.nextInt();
		}
		//Array traversing
		for(int j=(a.length-1);j>=0;j--)
		{
			System.out.println(a[j]);
		}
		scan.close();
		
	}

}
