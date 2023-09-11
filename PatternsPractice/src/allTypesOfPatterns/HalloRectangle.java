// Problem-2 Hallow rectangle star pattern
package allTypesOfPatterns;

public class HalloRectangle {

	public static void main(String[] args) {
		//Hallow pattern of 4 rows and 5 columns
		int row =4;
		int col =5;
			//outer loop
		for(int i=1;i<=row;i++)
		{
			//inner loop
				for(int j=1;j<=col;j++)
				{
					if(i==1||i==row || j==1||j==col)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
		}
	}

}
