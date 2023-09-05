package com.kodNest.Arrays;

import java.util.Scanner;

public class ReverseOrderInNewArray {

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
		
		int brr[]=new int[arr.length];
		System.out.println("Reverse order array in new array");
		for(int i =(arr.length-1),j=0;i>=0;i--,j++)
		{
			brr[j]=arr[i];
			System.out.println(brr[j]);
		}
		
	}

}
