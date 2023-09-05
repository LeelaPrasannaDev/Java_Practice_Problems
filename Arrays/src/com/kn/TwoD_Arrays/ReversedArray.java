package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class ReversedArray {

	public static void main(String[] args) {
		// Create scanner object to take values from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array = ");
		int size = scan.nextInt();
		//Array Declaration
		int []arr;
		//Array Creation
		arr = new int[size];
		//Array Initialization
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element for "+(i+1)+" = ");
			arr[i]=scan.nextInt();
		}
		//Array traversing
		System.out.println("Array original elements");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//Array reversing
		System.out.println("Array elements after reversing");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
