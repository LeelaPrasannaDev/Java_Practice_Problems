//Write a java program to rotate an array by 'k' elements towards right and print the final array  
package com.kodNest.Arrays;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// initialization of array
		int []arr = {1,2,3,4,5,6,7};
		System.out.println("Original array");
		for(int intialElements:arr) {
			System.out.print(intialElements+" "+"\n");
		}
		// reading the value of k
		System.out.println("Enter the value of k =");
		int kNum = scan.nextInt();
		// creating a temporary array
		int [] tem = new int[arr.length];
		// storing values in temporary array
		for(int i =0;i<kNum;i++)
		{
			int length = arr.length;
			tem[i] = arr[length-kNum+i];
		}
		// shifting remaining elements 
		for(int i=arr.length-1;i>=kNum;i--)
		{
			arr[i] = arr[i-kNum];
		}
		//Storing temporary elements to original array
		for(int i=0;i<kNum;i++)
		{
			arr[i]= tem[i];
		}
		scan.close();
		//array traversing
		System.out.println("rotated array");
		for(int elements:arr) {
			System.out.print(elements+" ");
		}
	}
}
