package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Array Declaration
		int [][]arr;
	//Array Creation
		//use scanner build-in class to take data from the end user
		Scanner scan = new Scanner(System.in);
		System.out.println("----Enter Number of class present in your School----");
		arr = new int[scan.nextInt()][];
		//Creating array of arrays
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("----Enter number of students present in the "+(i+1)+" class----");
			arr[i]= new int[scan.nextInt()];
		}
	//Array Initialization
		// storing data in the array of arrays elements
		for(int i=0;i<arr.length;i++)
		{
			//System.out.println("---- "+(i+1)+" class----");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("----Enter roll number of the Absent student "+(j+1)+" ----");
				arr[i][j]=scan.nextInt();
			}
		}
	//Array Traversing
		//Accessing data from the elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" **** "+(i+1)+"class ****");
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("**** Roll Numbers of Absent student "+(j+1)+" ****");
				System.out.println(arr[i][j]);
			}
		}
	}

}
