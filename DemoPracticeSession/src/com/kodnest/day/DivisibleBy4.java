package com.kodnest.day;

import java.util.Scanner;

public class DivisibleBy4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to perform division by 4 and leaves 0 as reminder = ");
		int num = scan.nextInt();
		DivBy4 o = new DivBy4();
		o.isDivBy4(num);
		scan.close();

	}


}
