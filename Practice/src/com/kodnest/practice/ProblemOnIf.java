package com.kodnest.practice;

import java.util.Scanner;

public class ProblemOnIf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your marks = ");
		int marks = scan.nextInt();
		scan.close();
		if(marks>35)
		{
			System.out.println("Your are pass");
		}
	}

}
