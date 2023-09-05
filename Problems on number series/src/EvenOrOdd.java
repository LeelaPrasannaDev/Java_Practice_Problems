import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its Even or Odd = ");
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("Given number "+num+" is an Even");
		}
		else {
			System.out.println("Given number "+num+" is an Odd");
		}
		scan.close();
	}

}
