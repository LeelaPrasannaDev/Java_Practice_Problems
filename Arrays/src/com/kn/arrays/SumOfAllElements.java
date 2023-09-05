package com.kn.arrays;

import java.util.Scanner;

public class SumOfAllElements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Array declaration
		int a[] ;
		//Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array = ");
		a = new int [scan.nextInt()];
		//Array intialzation
		for(int i =0;i<a.length;i++)
		{
			System.out.println("Enter elements = ");
			a[i]=scan.nextInt();
		}
		//Array traversing
		traversing(a);
		
	}

	private static void traversing(int[] a)
	{
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=a.length-1;i>=0;i--) {
			int tem=a[i];
			sum=sum+tem;
		}
		System.out.println(sum);
		
	}
}
