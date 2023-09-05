package com.kodnest.practice;

import java.util.Scanner;

public class DemoOnWhileLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to print number upto there = ");
		int num = scan.nextInt();
		scan.close();
		int i=0;
		while(i<=num) {
			System.out.println(i);
			i++;
		}
		
	}

}
