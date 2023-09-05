package com.kodNest.Arrays;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base size of an array = ");
		int[][][]arr=new int[scan.nextInt()][][];
		
		//Array creation;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new int[arr.length][];
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=new int[arr[i].length];
			}
		}
		
		//Array initialization
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println("Enter the elements of "+k+" in array = ");
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		
		//array traversing
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.println(arr[i][j][k]);
				}
			}
		}
	}

}
