package com.kodnest.w3StringPracticeProblems;

import java.util.Scanner;

public class CharAtGivenIndexDemo {

	public static void main(String[] args) {
		//Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String inputString = scan.nextLine();
		System.out.println("Enter the index number to print charecter = ");
		int inputInt = scan.nextInt();
		//Create object for this class
		CharAtGivenIndex charAtGivenIndex = new CharAtGivenIndex();
		//Call method
		charAtGivenIndex.checkCharIndex(inputString,inputInt);
		//release resources
		scan.close();
	}

}
