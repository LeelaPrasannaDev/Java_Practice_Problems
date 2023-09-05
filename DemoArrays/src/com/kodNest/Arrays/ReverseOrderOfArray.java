package com.kodNest.Arrays;

import java.util.Scanner;

public class ReverseOrderOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr = new int[5];
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter elements for "+i+" index = ");
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Elements present in array");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Reverse of an array");
		for(int i =(arr.length-1);i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
