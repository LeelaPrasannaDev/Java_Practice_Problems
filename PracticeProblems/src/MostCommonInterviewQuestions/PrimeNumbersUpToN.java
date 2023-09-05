package MostCommonInterviewQuestions;

import java.util.Scanner;

public class PrimeNumbersUpToN {

	public static void main(String[] args) {
		// import scanner build-in class to take user input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a range to print all prime numbers upto that = ");
		int num = scan.nextInt();
		scan.close();
		
		for(int i=2;i<=num;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
		if(isPrime)
		{
			System.out.println(i+" is a prime number");
		}
		}
		

	}

}
