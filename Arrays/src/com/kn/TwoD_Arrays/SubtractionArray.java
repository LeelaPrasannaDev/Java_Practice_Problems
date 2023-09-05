package com.kn.TwoD_Arrays;

import java.util.Scanner;

public class SubtractionArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Array Declaration
		System.out.println("Enter size to create Array = ");
		int[][] arr;
		int[][] brr;
		// Array Creation
		arr = new int[scan.nextInt()][];
		brr = new int[arr.length][];
		creation(arr, brr, scan);
		// Array Initialization
		initializationArray(arr, brr, scan);
		// Array Subtraction
		subtractionArrays(arr, brr, scan);

	}

	private static void subtractionArrays(int[][] arr, int[][] brr, Scanner scan) {
		int[][] crr = new int[arr.length][arr[0].length];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				crr[row][col] = arr[row][col] - brr[row][col];
			}
		}
		// Array Traversing
		traversing(arr, brr, crr);

	}

	private static void traversing(int[][] arr, int[][] brr, int[][] crr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(crr[row][col] + " ");
			}
			System.out.println();
		}
	}

	private static void initializationArray(int[][] arr, int[][] brr, Scanner scan) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("Enter Elements in the " + (row + 1) + ".. = ");
				arr[row][col] = scan.nextInt();
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.println("Enter Elements in the " + (row + 1) + "... = ");
				brr[row][col] = scan.nextInt();
			}
		}

	}

	private static void creation(int[][] arr, int[][] brr, Scanner scan) {
		System.out.println("Enter no of Arrays in the Main array = ");
		int store = scan.nextInt();
		for (int row = 0; row < arr.length; row++) {
			arr[row] = new int[store];
			brr[row] = new int[store];
		}
	}

}
