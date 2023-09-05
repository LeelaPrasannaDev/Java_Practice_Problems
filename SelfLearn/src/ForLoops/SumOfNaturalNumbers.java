package ForLoops;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print sum of natural numbers upto =  ");
		int num = scan.nextInt();
		scan.close();
		int sumOfNaturalNums = sumNatural(num);
		System.out.println("Sum of natural numbers upto given number = "+sumOfNaturalNums);
	}

	private static int sumNatural(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i<=num; i++)
		{
			sum = sum + i;
		}
		return sum;
	}

}
