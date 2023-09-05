import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		welcome();
		CalApp c1 = new CalApp("Caluclator","VK-SOS",2.0);
		System.out.println("Your Gadget name =  "+c1.name);
		System.out.println("Your Gadget company = "+ c1.company);
		System.out.println("Your Gadget version =  "+c1.version);

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Select Which Arthamatic operation do you want to perform (+,-,*,/)= ");
		char special = scan.nextLine().charAt(0);
		if(special == '+'|| special == '-' || special == '*'|| special=='/')
		{
			
		System.out.println("Enter 1st number to perform operation = ");
		int a = scan.nextInt();
		System.out.println("Enter 2nd number to perform operation = ");
		int b = scan.nextInt();
		
		if (special == '+')
		{
			System.out.println("Addition for given numbers = "+a+"+"+b+'='+(a+b));
		}
		else if (special == '-')
		{
			System.out.println("Substraction for given numbers = "+a+"-"+b+'='+(a-b));
		}
		else if (special == '*')
		{
			System.out.println("Multiplication for given numbers = "+a+"*"+b+'='+(a*b));
		}
		else if (special == '/')
		{
			System.out.println("Division for two numbers = "+a+"/"+b+'='+(a/b));
		}
		}
		else
		{
			System.out.println("Enter correct operator");
		}
		
	}

	 static void welcome() {
		// TODO Auto-generated method stub
		System.out.println("..............Welcome.............");
		System.out.println("This is an Arthematic calculation App");
	}

}
