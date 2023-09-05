package com.kn.arrays;

import java.util.Scanner;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// Array Declaration
		int[] arr;
		int[] brr;
		// Array Creation
// take Scanner build-in class to take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array = ");
		arr = new int[scan.nextInt()];
		brr = new int[arr.length];

		// Array initialization
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter elements in the array = ");
			arr[i] = scan.nextInt();
		}
			for (int j = 1; j < brr.length; j++) {
				System.out.println("Enter elements in the next  array = ");
				brr[j] = scan.nextInt();
			}
		
		// Array Traversing
		int[] sum = sumOfArrays(arr, brr);
		System.out.println(sum);

	}

	private static int[] sumOfArrays(int[] arr, int[] brr) {
		int[] crr = new int[arr.length];
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
			for (int j = 0; j < brr.length; j++) {
				System.out.println(brr[j]);

				for (int k = 0; k < crr.length; k++)
					crr[k] = arr[i] + brr[j];
			}
		}

		return crr;
	}

}
