package com.kodnest.ceaserCipher;

import java.util.Scanner;

public class CeaserCipherDemo {

	public static void main(String[] args) {
		//Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string = ");
		String inputString = scan.nextLine();
		System.out.println("Enter a number to skip = ");
		int inputNum = scan.nextInt();
		//creating object to this class
		
		CeaserCipher ceaserCipher = new CeaserCipher();
		//Method calling
		char [] crr=ceaserCipher.checkCeaserCipher(inputString,inputNum);
		String s1 = new String(crr);
		System.out.println(s1);
		//Release resources
		scan.close();
		
	}

}
