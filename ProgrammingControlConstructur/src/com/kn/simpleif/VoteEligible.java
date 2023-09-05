package com.kn.simpleif;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age to know if you are eligible for voting = ");
		int age = scan.nextInt();
		boolean flag = vote(age);
		scan.close();
		if (flag) {
			System.out.println("Your are eligible for voting !");
		}
		else
		{
			System.out.println("Your are not eligible for voting..");
		}
	}

	private static boolean vote(int age) {
		// TODO Auto-generated method stub
		if (age>18)
		{
		return true;
		}
		else
		{
			return false;
		}
	}

}
