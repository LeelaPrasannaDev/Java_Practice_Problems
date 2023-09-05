import java.util.Scanner;

public class SquareNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find square of it = ");
		int num = scan.nextInt();
		squareNumber(num);
		int sqr=(num*num);
		System.out.println("Square of given number = "+sqr);
		scan.close();
	}

	 static int squareNumber(int num) {
		// TODO Auto-generated method stub
		return(num);
	}

}
