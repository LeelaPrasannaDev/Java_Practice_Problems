//Problem-1 Solid Rectangle Star pattern
package allTypesOfPatterns;

public class SolidRectangle {

	public static void main(String[] args) {
		// Star pattern of 4 rows and 5 columns
		int row = 4;
		int col = 5;
		//outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
			for(int j=1;j<=col;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
