package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Declaration of array
		int[]arr;
		//creation of array
		System.out.println("Enter the size of array = ");
		arr = new int[scan.nextInt()];
		//Array initialization
		System.out.println("Enter the elements in array = ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		//array Traversing
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				int temp =0;
				temp = arr[i];
				arr[i] = arr[j+1];
				arr[j+1]= temp;
			}
			System.out.println();
		}
	}

}
