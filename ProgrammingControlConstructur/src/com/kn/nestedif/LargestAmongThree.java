package com.kn.nestedif;

import java.util.Scanner;

public class LargestAmongThree {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Three numbers = ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			scan.close();
			equalAndLarg(num1,num2,num3);
		}

		private static void equalAndLarg(int num1, int num2, int num3) {
			// TODO Auto-generated method stub
			if (num1==num2)
			{
				if (num1 == num3)
				{
					System.out.println("All are equal");
				}
			}
			else
			{
				if(num1>num2 && num1>num3)
				{
					System.out.println(num1+" is grater number among three ");
				}
				else if (num2>num1 && num2>num3)
				{
					System.out.println(num2+" is grater number among three");
				}
				else
				{
					System.out.println(num3+" is greater number among three");
				}
			}
		}


	}

