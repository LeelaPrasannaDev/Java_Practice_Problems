package com.kn.switchCase;

import java.util.Scanner;

public class GradeAndScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade to print score range(A,B,C,D,F) = ");
		char grade = scan.nextLine().charAt(0);
		scan.close();
		gradeScore(grade);
	}

	private static void gradeScore(char grade) {
		// TODO Auto-generated method stub
		switch(grade)
		{
		case 'A':
			System.out.println("90 to 100");
			break;
		case 'B':
			System.out.println("80 to 90");
			break;
		case 'C':
			System.out.println("70 to 80");
			break;
		case 'D':
			System.out.println("60 to 70");
			break;
		case 'E':
			System.out.println("50 to 60");
			break;
		case 'F':
			System.out.println("40 to 50 fail");
			break;
		default:
			System.out.println("Enter correct Grade!");
			
		}
	}

}
