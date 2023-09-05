package com.kn.arrays;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		//Create scanner object to take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array = ");
		int size = scan.nextInt();
		//Array Declaration
		int[] arr;
		//Array Creation
		arr = new int[size];
		//Array Initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element of "+(i+1)+"= ");
			arr[i]=scan.nextInt();
		}
		//Array Traversing
		System.out.println("Orginal array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int sumOfArray=sumOfArrayEle(arr);
		System.out.println(sumOfArray);
	}

	private static int sumOfArrayEle(int []arr) {
		System.out.println(" Sum of array elements");
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		return sum;
	}

}
