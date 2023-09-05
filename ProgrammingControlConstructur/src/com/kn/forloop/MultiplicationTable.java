package com.kn.forloop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTable();
	}

	private static void printTable() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number to print that table = ");
		int num = scan.nextInt();
		scan.close();
		for(int i =1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
	}

}
