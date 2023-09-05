package com.kn.switchCase;

import java.util.Scanner;

public class Polygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of sides from 3 to 10 = ");
		int sides = scan.nextInt();
		polygons(sides);
	}

	private static void polygons(int sides) {
		// TODO Auto-generated method stub
		switch(sides)
		{
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
		case 7:
			System.out.println("Heptagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		case 9:
			System.out.println("Nonagon");
			break;
		case 10:
			System.out.println("Decagon");
			break;
		default:
			System.out.println("invalid number, Enter numbers only from 3 to 10!");
		}
		
	}

}
