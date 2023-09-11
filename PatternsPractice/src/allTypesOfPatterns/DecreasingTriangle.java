// problem -4 Decreasing triangle star pattern
package allTypesOfPatterns;

public class DecreasingTriangle {

	public static void main(String[] args) 
	{
		// star pattern of 4 rows and 4 columns
		
		int row = 4;
		int col = 4;
		
		//outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
			
			for(int j=1;j<=col;j++)
			{
				if(i+j<=5)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
