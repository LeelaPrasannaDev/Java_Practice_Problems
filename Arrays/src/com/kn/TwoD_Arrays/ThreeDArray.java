package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration
		int [][][]arr;
		int [][][]brr;
		int [][][]crr;
		//Array Creation
		System.out.println("Enter a number to create a Array = ");
		arr = new int[scan.nextInt()][][];
		brr = new int[arr.length][][];
		crr = new int[arr.length][][];
		//Array Creation
		creatingArray(arr,brr,crr,scan);
		// Array Initialization
		initializationArray(arr,brr,crr,scan);
		//Array Addition
		sumOfArray(arr,brr,crr,scan);
		
	}
	
	private static void creatingArray(int[][][] arr, int[][][] brr, int[][][] crr,Scanner scan) {
		System.out.println("Enter number to create array of arrays = ");
		int store = scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;i++)
			{
			arr[i][j]=new int[store];
//			brr[i][j]=new int[store];
//			crr[i][j]=new int[store];
			}
		}
	}

	private static void sumOfArray(int[][][] arr, int[][][] brr, int[][][] crr, Scanner scan) {
		int [][][]drr = new int[arr.length][arr[0].length][arr[1].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					drr[i][j][k]= arr[i][j][k]+brr[i][j][k]+crr[i][j][k];
				}
			}
		}
		//Array Traversing
		traversingArray(arr,brr,crr,drr);
	}

	private static void traversingArray(int[][][] arr, int[][][] brr, int[][][] crr, int[][][] drr) {
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(crr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	private static void initializationArray(int[][][] arr, int[][][] brr, int[][][] crr, Scanner scan) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter values in the array of arrays =  ");
					arr[i][j][k]= scan.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter values in the array of arrays =  ");
					brr[i][j][k]= scan.nextInt();
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter values in the array of arrays =  ");
					crr[i][j][k]= scan.nextInt();
				}
			}
		}
	}
}
