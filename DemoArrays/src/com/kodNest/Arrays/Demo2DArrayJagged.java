package com.kodNest.Arrays;

import java.util.Scanner;

public class Demo2DArrayJagged {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr;
		System.out.println("Enter the base size of array = ");
		arr = new int[scan.nextInt()][];
		//Array Creation
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the size of "+i+" index = ");
			arr[i]=new int[scan.nextInt()];
		}
		
		//Array initialization
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the elements of "+j+" indexs = ");
				arr[i][j]=scan.nextInt();
			}
		}
		scan.close();
		//Array Traversing
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
