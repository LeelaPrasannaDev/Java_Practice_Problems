package com.kodnest.anagram;

public class CheckAnagramOrNot {
	public boolean  anagramCheckMethod(String inputString1,String inputString2) 
	{
		if(inputString1.length()==inputString2.length())
		{
			String s1 = new String(sortMethod(inputString1));
			String s2 = new String(sortMethod(inputString2));
			if(s1.equals(s2))
			{
				return true;
			}
			return false;
		}
		return false;
	}

	private char[] sortMethod(String inputString) 
	{
		char []arr = inputString.toCharArray();
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
}