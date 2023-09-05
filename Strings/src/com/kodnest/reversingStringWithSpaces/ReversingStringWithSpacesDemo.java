package com.kodnest.reversingStringWithSpaces;

import java.util.Scanner;

public class ReversingStringWithSpacesDemo {

	public static void main(String[] args) {
		//Take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String inputString = scan.nextLine();
		
		//create object to this class 
		ReversingStringWithSpaces reversingStringWithSpaces = new ReversingStringWithSpaces();
		
		//Calling method
		reversingStringWithSpaces.printReversedString(inputString);
		
		//Release resources
		scan.close();
	}

}
