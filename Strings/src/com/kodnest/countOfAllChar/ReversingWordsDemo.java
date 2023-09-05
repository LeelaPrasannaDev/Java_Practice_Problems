package com.kodnest.countOfAllChar;

import java.util.Scanner;

public class ReversingWordsDemo {

	public static void main(String[] args) {
		//Take input from the user
		Scanner scan = new Scanner(System.in);
		System.err.println("Enter a string to reverse = ");
		String inputString = scan.nextLine();
		
		//Creating object for the class
		ReversingWords reversingwords = new ReversingWords();
		//calling method reversing word
		reversingwords.reversingWordsMethod(inputString);
		//Releasing resources
		scan.close();
		
		
	}

}
