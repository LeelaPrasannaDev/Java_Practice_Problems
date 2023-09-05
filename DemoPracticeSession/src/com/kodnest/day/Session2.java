package com.kodnest.day;

public class Session2 {

	public static void main(String[] args) {
		int a=20;
		int m=1;
		byte b=(byte)a;			//type casting
		a=a+b;
		b=(byte)((b++)+(a*a)+(a/b)+(b%a));
		System.out.println(b);
		long l = b;
		b=(byte)m;
		System.out.println(b);
	}

}
