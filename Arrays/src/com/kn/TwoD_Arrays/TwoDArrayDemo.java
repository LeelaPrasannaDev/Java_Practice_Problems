package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class TwoDArrayDemo 
{

	public static void main(String[] args) 
	{
//Array Declaration
		int [][]arr;
//Array Creation
		//use scanner build-in class to take date from the end user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of batches = ");
		arr = new int[scan.nextInt()][];
		// Creating array of arrays elements
		for (int i =0;i<arr.length;i++)
		{
			System.out.println("Number of Friends in "+(i+1)+" batch = ");
			arr[i]=new int[scan.nextInt()];
		}
//Array Initialization
		// Storing data in array of arrays elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("*****"+(i+1)+"Batch *****");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter your"+(j+1)+" roll number = ");
				arr[i][j]=scan.nextInt();
			}
		}
//Array Traversing
		//Accessing array elements data
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("---------- "+(i+1)+" Batch ---------");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("------Your "+(j+1)+" Friend Roll Number--------");
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
