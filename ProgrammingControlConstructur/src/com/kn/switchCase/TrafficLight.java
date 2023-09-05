package com.kn.switchCase;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter color of traffic light (Red as R & Yellow as Y & Green as G)= ");
		char light = scan.nextLine().charAt(0);
		trafficLights(light);
	}

	private static void trafficLights(char light) {
		// TODO Auto-generated method stub
		switch(light)
		{
		case 'R':
			System.out.println("Stop");
			break;
		case 'Y':
			System.out.println("Ready");
			break;
		case 'G':
			System.out.println("Go");
			break;
		default:
			System.out.println("Enter correct color!");
		}
	}

}
