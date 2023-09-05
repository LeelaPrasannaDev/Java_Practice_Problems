package com.kn.arrays;

import java.util.Scanner;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		//Create scanner object to take values from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array = ");
		int size = scan.nextInt();
		//Array declaration
		double [] arr;
		//Array Creation
		arr = new double[size];
		//Array Initialization
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter elements of "+(i+1)+" = ");
			arr[i]=scan.nextDouble();
		}
		//Array Traversing
		System.out.println("Original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		double sumOfArrayEle = sumOfArrayElements(arr);
		System.out.println(sumOfArrayEle);
		double averageOfArrayEle=averageOfArrayElements(arr,sumOfArrayEle);
		System.out.println(averageOfArrayEle);
	}

	private static double averageOfArrayElements(double[] arr, double sumOfArrayEle) {
		System.out.println("Average of Array elemnets");
		double avg = (sumOfArrayEle/arr.length);
		return avg;
	}

	private static double sumOfArrayElements(double[] arr) 
	{
		System.out.println("Sum of Array elements");
		double sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		
		return sum;
	}

}
