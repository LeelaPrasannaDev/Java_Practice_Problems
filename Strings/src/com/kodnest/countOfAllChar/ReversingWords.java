package com.kodnest.countOfAllChar;

public class ReversingWords 
{
	public  void reversingWordsMethod(String inputString)
	{
		String [] srr = inputString.split(" ");
		for(int i=0;i<srr.length;i++)
		{
			reverseLogic(srr[i]);
		}
	}

	private void reverseLogic(String srr) 
	{
		char[] crr = srr.toCharArray();
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
		}
		System.out.print(" ");
	}
}
