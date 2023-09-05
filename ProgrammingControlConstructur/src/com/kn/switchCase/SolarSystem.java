package com.kn.switchCase;

import java.util.Scanner;

public class SolarSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any planet name to find its place order = ");
		String name = scan.nextLine();
		solarSystemOrder(name);
	}

	private static void solarSystemOrder(String name) {
		// TODO Auto-generated method stub
		switch(name)
		{
		case "sun":
			System.out.println(0);
			break;
		case "mercury":
			System.out.println(1);
			break;
		case "venus":
			System.out.println(2);
			break;
		case "earth":
			System.out.println(3);
			break;
		case "mars":
			System.out.println(4);
			break;
		case "jupiter":
			System.out.println(5);
			break;
		case "saturn":
			System.out.println(6);
			break;
		case "uranus":
			System.out.println(7);
			break;
		case "neptune":
			System.out.println(8);
			break;
		default:
			System.out.println("Invalid planet name!");
		}
	}

}
