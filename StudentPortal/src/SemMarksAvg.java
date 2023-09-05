import java.util.Scanner;

public class SemMarksAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****** Welcome to Student portal ******");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your 1st sem marks =  \n Enter your 2nd sem marks =  \n Enter your 3rd sem marks =   \n Enter your 4th sem marks =  \n Enter your 5th sem marks =  \n Enter your 6th sem marks =  \n Enter your 7th sem marks =  \n Enter your 8th sem marks =  ");
		int sem1 = scan.nextInt();
		int sem2 = scan.nextInt();
		int sem3 = scan.nextInt();
		int sem4 = scan.nextInt();
		int sem5 = scan.nextInt();
		int sem6 = scan.nextInt();
		int sem7 = scan.nextInt();
		int sem8 = scan.nextInt();
//		average(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		
		System.out.println("Average of total marks = "+average(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));
//		System.out.println();
	}

	public static double average(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
		double total = ((sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8);
		return (total);
		
	}

}
