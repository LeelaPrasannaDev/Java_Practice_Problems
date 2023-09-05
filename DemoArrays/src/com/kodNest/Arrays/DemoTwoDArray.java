package com.kodNest.Arrays;

import java.util.Scanner;

public class DemoTwoDArray {

	public static void main(String[] args) {
		byte[][] arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array = ");
		arr = new byte[scan.nextByte()][scan.nextByte()];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				
			System.out.println("Enter the elements in the array = ");
			arr[i][j]=scan.nextByte();
			
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
