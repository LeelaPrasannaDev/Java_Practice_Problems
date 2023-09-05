package romanNumbers;

import java.util.Scanner;

public class IntToRomanNumbersDemo {

	public static void main(String[] args) {
		
		//Take input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int inputNum = scan.nextInt();
		
		String[] srr = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		//creating object for this class
		IntToRomanNumbers intToRomanNumbers = new IntToRomanNumbers();
		
		//Calling methods
		intToRomanNumbers.romanNumbersMethod(inputNum,srr,arr);
		
		//release recourses
		scan.close();
	}

}
