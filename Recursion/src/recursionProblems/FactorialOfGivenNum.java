package recursionProblems;

public class FactorialOfGivenNum 
{
	public int fact(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else
		{
			return num * fact(num-1);
		}
		
	}
}
