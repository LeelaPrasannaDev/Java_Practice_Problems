package com.kn.forloop;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to print first prime numbers =  ");
		int num = scan.nextInt();
		scan.close();
		primeNum(num);
	}

	private static void primeNum(int num) {
		// TODO Auto-generated method stub
		int range = 1000;
		int count = 0;
		for(int j =2; j<=range;j++ )
		{
			for(int i =1; i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
				if(count==2)
				{
					System.out.println(count);
				}
			}
		}
	}

}
