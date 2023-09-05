package com.kodNest.Arrays;

import java.util.Scanner;

public class ReplacePrimeNumbersByNegitiveOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[5];
		// array initialization
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element for "+i+" = ");
			arr[i] = scan.nextInt();
		}
		//array traversing
		int count=0; 
		for(int i=2;i<arr.length;i++)
		{
			if(isPrime(arr[i]))
				arr[i]=-1;
				System.out.println(arr[i]); 
		}
	}

	private static boolean isPrime(int num) {
		for (int i = 3; i < num; i++) {
			if(num%i ==0){
				return false;
			}
			if(num%1 ==0)
			{
				return false;
			}
			
		}
		return true;
	}

}
