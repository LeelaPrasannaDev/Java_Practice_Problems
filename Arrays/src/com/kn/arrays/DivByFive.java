package com.kn.arrays;

import java.util.Scanner;

public class DivByFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration
		int arr[];
		//Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the aary = ");
		arr = new int[scan.nextInt()];
		//Array initialization
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("enter elements ina array = ");
			arr[i]=scan.nextInt();
		}
		//Array Traversing
		traversing(arr);
	}

	private static void traversing(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]+" is an divisible by 5 ");
			}
		}
	}

}
