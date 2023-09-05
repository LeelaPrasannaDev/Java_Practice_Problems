package com.kodnest.string;

public class StringCompairson4 {

	public static void main(String[] args) {
		String s1 = "Ram";
		String s2 ="Sita";
		String s3 ="ram";
		String s4 = s3;
		if(s3==s4) {
			System.out.println("Same Refferences");
		}
		else {
			System.out.println("Different Refferences");
		}
		if(s3.equals(s4)) {
			System.out.println("Same Data");
		}
		else {
			System.out.println("Different Data");
		
	}

}
}
