package com.kodnest.practice;

import java.util.Scanner;

public class NumIsPalindromeOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to know it is palindrome or not = ");
		int num = scan.nextInt();
		int r;
		int sum=0;
		int temp=num;
		while(num>0)
		{
			r= num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Given number "+num+" is palindrome");

		}
		else {
			System.out.println("Given number "+num+" is not a  palindrome");
		}

	}
}
