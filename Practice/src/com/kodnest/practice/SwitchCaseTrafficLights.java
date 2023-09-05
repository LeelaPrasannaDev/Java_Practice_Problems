package com.kodnest.practice;

import java.util.Scanner;

public class SwitchCaseTrafficLights {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any colour to know the Traffic sign (Red-r,Yellow-y,Green-g)= ");
		char signal = scan.next().charAt(0);
		scan.close();
		switch(signal)
		{
		case 'r':
			System.out.println("Red");
			break;
		case 'y':
			System.out.println("Yello");
			break;
		case 'g':
			System.out.println("Green");
		}
		
	}

}
