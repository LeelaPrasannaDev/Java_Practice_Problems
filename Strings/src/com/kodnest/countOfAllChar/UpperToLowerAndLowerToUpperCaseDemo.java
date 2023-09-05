package com.kodnest.countOfAllChar;

import java.util.Scanner;

public class UpperToLowerAndLowerToUpperCaseDemo {

	public static void main(String[] args) {
		//user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String str = scan.nextLine();
		//create object to class
		UpperToLowerAndLowerToUpperCase upperToLowerAndViceVersa = new UpperToLowerAndLowerToUpperCase();
		//method
		 String temp = upperToLowerAndViceVersa.printUpperToLowerAndLowerToUpperCase(str);
		//print
		System.out.println(temp);
		//Release resources
		scan.close();
	}

	


}
