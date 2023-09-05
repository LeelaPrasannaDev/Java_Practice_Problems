package com.kn.switchCase;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What operation do you want to perform  (+,-,*,/)= ");
		char symbol = scan.nextLine().charAt(0);
		System.out.println("Enter two numbers to perform above operation = ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		scan.close();
		int totalSum=sum(num1,num2);
		int totalDiffirence=subtraction(num1,num2);
		int totalMulti=multiplication(num1,num2);
		int totalDiv=division(num1,num2);
		calculator(symbol,num1,num2,totalSum,totalDiffirence,totalMulti,totalDiv);
	}
	private static void calculator(char symbol, int num1, int num2, int totalSum, int totalDiffirence, int totalMulti,
			int totalDiv) {
		// TODO Auto-generated method stub
		switch(symbol)
		{
		case'+':
			System.out.println("Addition for given numbers "+num1+" + "+num2+"  = "+totalSum);
			break;
		case '-':
			System.out.println("Subtraction for given numbers "+num1+" - "+num2+" = "+totalDiffirence);
			break;
		case '*':
			System.out.println("Multiplecation for given numbers "+num1+" * "+num2+" = "+totalMulti);
			break;
		case '/':
			System.out.println("Division for given numbers "+num1+" / "+num2+" = "+totalDiv);
			break;
		default:
			System.out.println("Enter correct operation");
		}
		
	}
	private static int division(int num1, int num2) {
		// TODO Auto-generated method stub
		int div=num1/num2;
		return div;
	}



	private static int multiplication(int num1, int num2) {
		// TODO Auto-generated method stub
		int mul = num1*num2;
		return mul;
	}



	private static int subtraction(int num1, int num2) {
		// TODO Auto-generated method stub
		int sub = num1-num2;
		return sub;
	}



	private static int sum(int num1, int num2) {
		// TODO Auto-generated method stub
		int addition = num1+num2;
		return addition;
	}

	}


