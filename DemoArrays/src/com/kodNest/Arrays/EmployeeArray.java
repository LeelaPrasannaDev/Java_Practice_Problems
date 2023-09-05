package com.kodNest.Arrays;

import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee[] e = new Employee[10];
		for(int i =0;i<e.length;i++)
		{
			e[i]= new Employee();
		}
		//Array Initialization
		for(int i =0;i<e.length;i++)
		{
			System.out.println("Enter the name of employee "+(i+1)+" = ");
			e[i].name = scan.nextLine();
			System.out.println("Enter the id of employee "+(i+1)+" = ");
			e[i].id = scan.nextInt();
			scan.nextLine();
		}
		scan.close();
		//Array Traversing
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Employee name = "+e[i].name+"\nEmployee id = "+e[i].id);
		}
	}

}
