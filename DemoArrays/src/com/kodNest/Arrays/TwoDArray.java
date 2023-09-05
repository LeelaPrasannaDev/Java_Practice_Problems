package com.kodNest.Arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array = ");
		int[][] arr = new int[scan.nextInt()][];
		//Array Creation
		for(int i=0;i<arr.length;i++) {
			
			arr[i]= new int[arr.length];
		}
		
		//Array Initialization
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the Elements of "+(j+1)+" of array =");
				arr[i][j]=scan.nextInt();
			}
		}
		//Array Traversing
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
	}

}
