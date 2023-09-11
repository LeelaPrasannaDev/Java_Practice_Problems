//Problem-8 Increasing Triangle With Number Series of 5 rows and 5 columns
package allTypesOfPatterns;

public class IncreasingTriangleWithNumberSeries {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int tempNumber = 1;
		
		//outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
			for(int j=1;j<=col;j++)
			{
				if(i-j>=0)
				{
					System.out.print(tempNumber);
					tempNumber++;
				}
			}
			System.out.println();
		}
		
	}

}
