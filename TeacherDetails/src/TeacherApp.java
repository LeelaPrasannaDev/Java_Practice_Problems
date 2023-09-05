import java.util.Scanner;

public class TeacherApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name = ");
		String name = scan.nextLine();
		System.out.println("Enter your age = ");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter your qulification = ");
		String qulification = scan.nextLine();
		Teacher t = new Teacher(name,age,qulification);
		t.output();
	}


}
