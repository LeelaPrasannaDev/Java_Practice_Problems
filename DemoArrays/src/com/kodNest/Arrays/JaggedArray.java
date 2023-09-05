package com.kodNest.Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a size for base array = ");
		int [][]arr = new int[scan.nextInt()][];
		//Array creation
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the size of "+(i+1)+" index = ");
			arr[i]=new int[scan.nextInt()];
		}
		
		//Array initialization
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter elements in the "+(j+1)+" array = ");
				arr[i][j]=scan.nextInt();
			}
		}
		scan.close();
		
		//Array Traversing
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			for(int j=arr[i].length-1;j>=0;j--)
			{
				System.out.println(arr[i][j]);
			}
		}		
	}

}
