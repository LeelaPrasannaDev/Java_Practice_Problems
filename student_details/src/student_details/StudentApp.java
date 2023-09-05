package student_details;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.print("Enter your Name =  ");
	    String name = scan.nextLine();
	    System.out.print("Enter your Age = ");
	    int age = scan.nextInt();
//	    scan.nextLine();
	    System.out.print("Enter your Roll no = ");
	    int roll_no  = scan.nextInt();
	    Student s = new Student(name,age,roll_no);
//	    s.name = name;
//	    s.age = age;
//	    s.roll_no = roll_no;
	    System.out.println("Your name is = "+ name);
	    System.out.println("Your age is = "+ age);
	    System.out.println("Your Roll no is = "+ roll_no);
	}

}
