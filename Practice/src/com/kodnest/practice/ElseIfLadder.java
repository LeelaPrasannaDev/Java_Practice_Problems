package com.kodnest.practice;

import java.util.Scanner;
public class ElseIfLadder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check it is positive or negative = ");
		int num = scan.nextInt();
		if(num==0)
		{
			System.out.println("Zero is neither positive nor negative");
		}
		else if(num>0)
		{
			System.out.println("Given number "+num+" is positive");
		}
		else
		{
			System.out.println("Give number "+num+" is negative");
		}
	}

}
