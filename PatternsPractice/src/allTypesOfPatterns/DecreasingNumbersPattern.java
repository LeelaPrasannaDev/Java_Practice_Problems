//problem-7 Decreasing numbers pattern 5 rows and 5 columns
package allTypesOfPatterns;

public class DecreasingNumbersPattern {

	public static void main(String[] args) {
		int row =5;
		int col =5;
		//outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
			for(int j=1;j<=col;j++)
			{
				if(i+j<=6)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
