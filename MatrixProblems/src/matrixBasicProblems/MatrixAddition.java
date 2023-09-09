package matrixBasicProblems;


public class MatrixAddition {
	public void add(int[][]arr,int[][]brr,int[][] crr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				crr[i][j]= arr[i][j]+brr[i][j];
			}
		}
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
