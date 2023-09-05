package com.kodnest.countOfAllChar;

public class UpperToLowerAndLowerToUpperCase {

	public String printUpperToLowerAndLowerToUpperCase(String str) {
		String[]st = str.split(" ");
		StringBuffer stringBuffer = new StringBuffer();
		for(String s:st)
		{
			char[]crr =s.toCharArray();
			if(crr[0]>=97&& crr[0]<=122);
			crr[0]=(char)(crr[0]-32);
		
		for(int i=0;i<crr.length;i++)
		{
			stringBuffer.append(crr[i]);
		}
		stringBuffer.append(" ");
		}
		String result = stringBuffer.toString();
		return result.trim();
	}
}
