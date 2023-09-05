package com.kodnest.countOfAllChar;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// take input from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String inputString = scan.nextLine();
		//create object for the class
		ReverseString reverseString = new ReverseString();
		//call the method
		reverseString.reverseCharactersInword(inputString);
		//release resources
		scan.close();
	}

}
