package com.kodNest.Arrays;

import java.util.Scanner;

public class CreationOfArray {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		Scanner scan = new Scanner(System.in);
		for(int i =0;i<student.length;i++) {
			student[i]= new Student();
		}
		//Array Initialization
		for(int i=0;i<student.length;i++)
		{
			System.out.println("Enter Data for "+i+" name = ");
			student[i].name = scan.nextLine();
			System.out.println("Enter Data for "+i+" age = ");
			student[i].age = scan.nextInt();
			scan.nextLine();
		}
		scan.close();
		//Array Traversing
		for(int i=0;i<student.length;i++)
		{
			System.out.println(student[i].name);
			System.out.println(student[i].age);
		}

	}

}

//		byte[] brr = new byte[5];
//		short[] srr = new short[5];
//		int[] arr = new int[5];
//		long[] lrr = new long[5];
//		float[] frr = new float[5];
//		double[]drr = new double[5];
//		boolean[] boo = new boolean[5];
//		char[] crr = new char[5];
//		String[] strr = new String[5];