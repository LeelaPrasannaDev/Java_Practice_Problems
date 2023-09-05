package com.kodnest.countOfAllChar;


public class ReverseString {
	//method to reverse char in each word
	public void reverseCharactersInword(String inputString) 
	{
		 String[]srr = inputString.split(" ");
		 for(int i=0;i<srr.length;i++)
		 {
			 reverseCharecters(srr[i]);
		 }
	}
	public void reverseCharecters(String srr)
	{
		char[]crr = srr.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}
	
}
