package com.kodNest.Arrays;

import java.util.Scanner;

public class EvenElementsInArray {

	public static void main(String[] args) {
		int[] arr = new int [5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter elements for "+i+" index = ");
			arr[i] = scan.nextInt();
		}
		scan.close();
		//Array Traversing
		System.out.println("Elements present in the array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Even Elements present in array");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
