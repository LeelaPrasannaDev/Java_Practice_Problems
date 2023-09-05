package com.kodnest.anagram;

import java.util.Scanner;

public class DemoCheckAnagramOrNot {

	public static void main(String[] args) {
		//Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First String = ");
		String inputString1 = scan.nextLine();
		System.out.println("Enter Secound String = ");
		String inputString2 = scan.nextLine();
		//Create a object for this class
		CheckAnagramOrNot checkAnagramOrNot = new CheckAnagramOrNot();
		
		//calling method
		boolean flag = checkAnagramOrNot.anagramCheckMethod(inputString1, inputString2);
		if(flag)
		{
			System.out.println("It is an Anagram");
		}
		else
		{
			System.out.println("Not a Anagram");
		}
		
		//Releasing resources
		scan.close();
	}

}
