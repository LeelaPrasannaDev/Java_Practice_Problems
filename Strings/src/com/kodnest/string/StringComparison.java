package com.kodnest.string;

public class StringComparison {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 = "Sita";
		String s3 = "Ram"+"Sita";
		String s4 = "Ram"+"Sita";
		if(s3==s4) {
			System.out.println("Same Refferences");
		}
		else
		{
			System.out.println("Different Refferences");
		}
		if(s3.equals(s4)) {
			System.out.println("Same Data");
		}
		else
		{
			System.out.println("Different Data");
		}
	}

}
