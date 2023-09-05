package MostCommonInterviewQuestions;

import java.util.Scanner;

public class PrimeOrComposite {

	// number must be greater then 1
	//Which has only two factors 1 and itself
	
	public static void main(String[] args) {
		
// use scanner build-in class to take input from the end user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check it is prime or composite number = ");
		int num = scan.nextInt();
		int count = 0;
		scan.close();
		//check condition to know given number is greater then 1 or not
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)  //number is greater than 1 enter into loop
			{
				if(num%i==0) //given number is divisible by i and gives 0 as reminder,then count value we be increased
				{
					count++;					
				}
			}
			if(count==2)// count value will be equal to two then only it is prime(number divisible by 1 and itself)
			{
				System.out.println("Given number is a prime number");
			}
			else
			{
				System.out.println("Given number is a composite number");
			}
			
		}
		else
		{
			System.out.println("Enter number more than 1 ");
		}
		
		
		
		
	}

}
