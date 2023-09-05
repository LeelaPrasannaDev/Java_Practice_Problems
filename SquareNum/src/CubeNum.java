import java.util.Scanner;

public class CubeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find cube of it = ");
		int num = scan.nextInt();
		squareNumber(num);
		int sqr=(num*num*num);
		System.out.println("cube of given number "+num+ " = " +sqr);
		scan.close();
	}

	 static int squareNumber(int num) {
		// TODO Auto-generated method stub
		return(num);
	}


	}

