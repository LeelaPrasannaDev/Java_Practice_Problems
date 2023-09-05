package com.kn.arrays;

import java.util.Scanner;

public class EvenArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array declaration
				int a[] ;
				//Array creation
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter size of array = ");
				a = new int [scan.nextInt()];
				//Array intialzation
				for(int i =0;i<a.length;i++)
				{
					System.out.println("Enter elements = ");
					a[i]=scan.nextInt();
				}
				//Array traversing
				traversing(a);
				
				
			}

			private static void traversing(int[] a)
			{
				// TODO Auto-generated method stub
				for(int i=0;i<=a.length;i++) {
					if(a[i]%2==0)
					{
						System.out.println(a[i]+" is an even number in Array");
					}

	}

			}
			}
