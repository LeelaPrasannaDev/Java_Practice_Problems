package com.kodnest.ceaserCipher;

public class CeaserCipher {
	public char[] checkCeaserCipher(String inputString, int inputNum) {
		char []arr = inputString.toCharArray();
		for(int i=0;i<arr.length;i++)
		{ 
			if((arr[i]>=65 && arr[i]<=90)||(arr[i]>='a' && arr[i]<='z') )
			{
				if(arr[i]<=90||arr[i]<='z')
				{
					arr[i]=(char)(arr[i]+inputNum);
				}
				else
				{
					arr[i]=(char)(arr[i]-26+inputNum);
				}
			}
		}
		return arr;
	}

}
