package com.kn.nestedif;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your three test marks = ");
		int test1 = scan.nextInt();
		int test2 = scan.nextInt();
		int test3 = scan.nextInt();
		studentScore(test1,test2,test3);
	}

	private static void studentScore(int test1, int test2, int test3) {
		// TODO Auto-generated method stub
		if (test1>=45 && test2>=45 && test3>=45)
		{
			if((test1+test2+test3/3)>=45)
			{
				System.out.println("You are scored above average!");
			}
		}
		else
		{
			System.out.println("score are too low Try next time......");
		}
	}

}
