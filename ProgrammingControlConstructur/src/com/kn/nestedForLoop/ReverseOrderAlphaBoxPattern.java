package com.kn.nestedForLoop;

public class ReverseOrderAlphaBoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
	}

}
