package com.kodnest.w3StringPracticeProblems;

public class CharAtGivenIndex {

	public void checkCharIndex(String inputString, int inputInt) {
		char[] arr = inputString.toCharArray();
			if(arr.length-1>=inputInt)
			{
				System.out.println(arr[inputInt]);
			}
			else
			{
				System.out.println("Enter index number correctly !");
			
		}
	}

}
