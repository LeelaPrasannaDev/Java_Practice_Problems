package com.kn.arrays;

import java.util.Scanner;

public class FindElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array Declaration & Creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the Array = ");
		// storing data from the end user
		int [] arr = new int[scan.nextInt()];
		
		//Array Initialization
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Enter elements for Array = ");
			arr[i]=scan.nextInt();
		}
		// calling method 
		boolean flag = findElementInArray(arr);
		if(flag)
		{
			System.out.println("Given number is present in Array");
		}
		else
		{
			System.out.println("Given number is not present in Array");
		}
		
	}
	// Method to return true if given element is present in the array or not 
	private static boolean findElementInArray(int[] arr) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find it is in Array or not = ");
		int temp = scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
		// condition to check temp number is equal to any element in the array
			if(arr[i]==temp)
			{
				return true;
			}
		}
		return false;
	}

}
