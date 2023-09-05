package com.kodnest.practice;

import java.util.Scanner;

public class DemoDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print numbers upto range = ");
		int num = scan.nextInt();
		scan.close();
		int i=0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<=num);
	}

}
