package com.kodNest.Arrays;

import java.util.Scanner;

public class JaggedArrayProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][]arr;
		arr = new int [5][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[1];
		arr[3]=new int[3];
		arr[4]=new int[4];
		//array initialization
		
		arr[0][0]= 3;
		arr[1][0]=5;
		arr[1][1]=2;
		arr[2][0]=6;
		arr[3][0]=8;
		arr[3][1]=9;
		arr[3][2]=4;
		arr[4][0]=7;
		arr[4][1]=0;
		arr[4][2]=2;
		arr[4][3]=1;
		
		//Array traversing
		
		//System.out.println(	arr[0][0]+"\n"+arr[1][0]+"\n"+arr[1][1]+"\n"+arr[2][0]+"\n"+arr[3][0]+"\n"+arr[3][1]+"\n"+arr[3][2]+"\n"+arr[4][0]+"\n"+arr[4][1]+"\n"+arr[4][2]+"\n"+arr[4][3]);
		System.out.print(arr[0][0]+" ");
		System.out.println();
		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println();
		System.out.print(arr[2][0]+" ");
		System.out.println();
		System.out.print(arr[3][0]+" ");
		System.out.print(arr[3][1]+" ");
		System.out.print(arr[3][2]+" ");
		System.out.println();
		System.out.print(arr[4][0]+" ");
		System.out.print(arr[4][1]+" ");
		System.out.print(arr[4][2]+" ");
		System.out.print(arr[4][3]+" ");
		
	}

}
