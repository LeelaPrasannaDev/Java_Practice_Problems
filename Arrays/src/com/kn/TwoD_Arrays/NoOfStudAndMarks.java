package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class NoOfStudAndMarks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//Array declaration
		int [][]arr;
//Array creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of students = ");
// storing number of students in NoOfstud from the end user input
		int noOfStud = scan.nextInt();
		System.out.println("Enter Number of subjects per student =  ");
//storing number of subjects for each student in NoOfSub from the end user
		int noOfSub = scan.nextInt();
		arr =new int[noOfStud][noOfSub];
		
	//Array Initialization
		for(int i=0;i<noOfStud;i++)
		{
			System.out.println("Enter student "+i+1+" data");
			for (int j=0;j<noOfStud;j++)
			{
				System.out.println("Enter subject "+j+1+" data");
				arr[i][j]=scan.nextInt();
			}
		}
// Array Traversing
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]);
				
			}
		}
			
			
	}
}
