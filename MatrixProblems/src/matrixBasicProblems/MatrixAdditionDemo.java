package matrixBasicProblems;

import java.util.Scanner;

public class MatrixAdditionDemo {

	public static void main(String[] args) {
		//Declaration and creation of an array
		int[][] arr = new int[3][3];
		int[][] brr = new int[3][3];
		int[][] crr = new int [3][3];
		
		// Taking input From the user
		// Declaration
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the value for " +arr[i][j]+" = ");
				arr[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.println("Enter the value for " +arr[i][j]+" = ");
				brr[i][j] = scan.nextInt();
			}
		}
		
		//creating object for this class
		MatrixAddition m = new MatrixAddition();
		// calling method
		m.add(arr,brr,crr);
		//Release resources
		scan.close();
	}

}
