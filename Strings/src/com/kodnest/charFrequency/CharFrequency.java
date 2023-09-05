package com.kodnest.charFrequency;

public class CharFrequency {

	public void charFrequencyMethod(String inputString) 
	{
		//change String into char array
		char []arr = inputString.toCharArray();
		// sort array
		arr= sortArrayMethod(arr);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		// count frequency
		int count=1;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]== arr[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i]+" occuering "+count+" times");
				count=1;
			}
			if(i+1==arr.length-1)
			{
				System.out.println(arr[i]+" occuering "+count+" times");
			}
		}
	}

	private char[] sortArrayMethod(char[] arr)
	{
		char temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
		
	}

}
