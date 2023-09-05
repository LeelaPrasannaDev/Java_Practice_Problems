package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class SelectedSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration
		int []arr;
		//Array Creation
		System.out.println("Enter the size of the array = ");
		arr = new int [scan.nextInt()];
		//Array Initialization
		System.out.println("Enter the elements in the array =  ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		//Array Traversing
		for(int i=0;i<arr.length;i++)
		{
			int min =arr[i];
			int index = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(min>arr[j])
				{
					min = arr[j];
					index = j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

}
