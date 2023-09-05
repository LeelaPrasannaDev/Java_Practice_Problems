package com.kodnest.day;

import java.util.Scanner;
public class Day {

	public static void main(String[] args) {
		System.out.println("Setty leela prasanna venkateswara");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any number = ");
	int a = scan.nextInt();
	System.out.println("Enter any byte value = ");
	byte b =scan.nextByte();
	System.out.println("Enter any short value = ");
	short c =scan.nextShort();
	System.out.println("Enter any long value = ");
	long d =scan.nextLong();
	System.out.println("Enter any float value = ");
	float e =scan.nextFloat();
	System.out.println("Enter any Double value = ");
	double f =scan.nextDouble();
	System.out.println("Enter any char value = ");
	char g =scan.next().charAt(0);
	System.out.println("Enter any boolean value = ");
	boolean h =scan.nextBoolean();
	System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h);
	d= (b+c);
	System.out.println("value of long "+d);
	a=(int) d;
	System.out.println("value of int after type casting long value"+a);
	
	}

}
