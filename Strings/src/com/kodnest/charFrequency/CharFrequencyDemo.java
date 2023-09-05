package com.kodnest.charFrequency;

import java.util.Scanner;

public class CharFrequencyDemo {

	public static void main(String[] args) {
		// take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String inputString = scan.nextLine();
		
		//create a object for this class
		CharFrequency charFrequency  = new CharFrequency();
		
		//call method
		charFrequency.charFrequencyMethod(inputString);
		
		//release resources
		scan.close();
	}

}
