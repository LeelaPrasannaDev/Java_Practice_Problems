package com.kn.ifelse;

import java.util.Scanner;

public class PassFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Grade = ");
		int grade = scan.nextInt();
		boolean flag = studentResult(grade);
		if (flag)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

	private static boolean studentResult(int grade) {
		// TODO Auto-generated method stub
		if (grade>50)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
