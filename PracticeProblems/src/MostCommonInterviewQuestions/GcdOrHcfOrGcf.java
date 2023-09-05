package MostCommonInterviewQuestions;

import java.util.Scanner;

public class GcdOrHcfOrGcf {

	public static void main(String[] args) {
		// import scanner to tack inputs from the end user
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter two numbers to find GCD or HCF or GCF = ");
		// Storing numbers which is given by the user in the variables num1 and num2
				int num1 = scan.nextInt();
				int num2 = scan.nextInt();
				scan.close();
		// taking another variable that is used to store GCD , now we do not know start with zero
				int g = 0;
		// loop to check possible all conditions
				for(int i=1;i<=num1;i++)
				{
		// logic to find GCD..
					if(num1%i==0 && num2%i==0)
					{
						g=i;
					}
				}
				System.out.println("The GCD or HCF or GCF = "+g);
				


	}

}
