import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your First name = ");
		String first_name=scan.nextLine();
		scan.nextLine();
		System.out.println("Enter your middle name = ");
		String middle_name = scan.nextLine();
		scan.nextLine();
		System.out.println("Enter your Last name = ");
		String last_name = scan.nextLine();
		joinStrings(first_name,middle_name,last_name);
		String fullName = first_name+middle_name+last_name;
		System.out.println("Your full name = "+fullName);
		
		
	}
	public static String joinStrings(String first_name ,String middle_name, String last_name)
	{
		return (first_name+middle_name+last_name);
		
	}

}
