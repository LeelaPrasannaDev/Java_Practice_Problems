package MostCommonInterviewQuestions;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
// import scanner in-build class to take values from the end user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any two numbers to find LCM = ");
// store the user given values in num1 and num2 variables
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
// initial a variable to store GCD value later
		int g =0;
// loop to check all the possibilities
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				g=i;
			}
		}
		int lcm = ((num1*num2)/g);
		System.out.println("LCM of given two numbers is = "+lcm);

	}

}
