package com.kn.arrays;

import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of first array = ");
		int firstArraySize = scan.nextInt();
		System.out.println("Enter size of secound array = ");
		int secoundArraySize = scan.nextInt();
		// Declaration and Creation of Array
		int []arr=new int [firstArraySize];
		int []brr = new int[secoundArraySize];
		int []crr= new int[firstArraySize+secoundArraySize];
		// Initialization of array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter elements for First Array "+i+"= ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<brr.length;i++)
		{
			System.out.println("Enter elements for Secound Array "+i+"= ");
			 brr[i]= scan.nextInt();
		}
		//printing given elements
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<brr.length;i++)
		{
			System.out.print(brr[i]+" ");
		}
		//Traversing on merge
		for(int i=0;i<crr.length;i++)
		{
			crr[i]=arr[i]+brr[i];
			System.out.print(crr[i]+" ");
		}
	}

}
