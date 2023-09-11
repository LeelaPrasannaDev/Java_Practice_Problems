//problem-5 Decreasing spaces and increasing star pattern
package allTypesOfPatterns;

public class DecreasingSpacesAndIncreasingStar {

	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		// outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
			for(int j=1;j<=col;j++)
			{
				if(i+j<=4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
