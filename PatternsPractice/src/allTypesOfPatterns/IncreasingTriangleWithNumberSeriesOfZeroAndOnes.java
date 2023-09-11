//problem-9 Increasing Triangle With Number Series zeros and ones of 5 rows and 5 columns
package allTypesOfPatterns;

public class IncreasingTriangleWithNumberSeriesOfZeroAndOnes {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		//outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
			for(int j=1;j<=col;j++)
			{
				if(i-j>=0)
				{
					if((i+j)%2==0)
					{
						System.out.print(1);
					}
					else
					{
						System.out.print(0);
					}
				}
			}
			System.out.println();
		}
	}

}
