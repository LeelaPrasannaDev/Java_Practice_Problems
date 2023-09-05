package com.kodnest.reversingStringWithSpaces;

public class ReversingStringWithSpaces 
{

	public void printReversedString(String inputString) 
	{
		// Convert String into Char Array
		
		char[] arr = inputString.toCharArray();
		
		//Create duplicate Array with same length
		char[] crr = new char[arr.length];
		
		//Store spaces and reverse
		char[]result=reverseMethod(arr,crr);
		System.out.println(result);
		
	}

	private char[] reverseMethod(char[] a,char[] c) 
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==' ')
			{
				c[i]=' ';
			}
		}
		int j = a.length-1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				if(c[j]==' ')
				{
					j--;
				}
				c[j]=a[i];
				j--;
			}
		}
		return c;
		
	}

}
