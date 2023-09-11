// problem-6 Increasing number pattern
package allTypesOfPatterns;

public class IncreasingNumberPattern {

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
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
