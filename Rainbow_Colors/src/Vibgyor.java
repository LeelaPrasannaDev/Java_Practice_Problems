import java.util.Scanner;

public class Vibgyor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any alpha to obtain color = ");
		char c = scan.nextLine().charAt(0);
		switch(c)
		{
		case 'v':
		case 'V':
			System.out.println("voilet color");
			break;
		
		case 'i':
		case 'I':
			System.out.println("Indigo color");
			break;
		
		case 'b':
		case 'B':
			System.out.println("Blue color");
			break;
		
		case 'g':
		case 'G':
			System.out.println("Green color");
			break;
		
		case 'y':
		case 'Y':
			System.out.println("Yellow color");
			break;
		
		case'o':
		case 'O':
			System.out.println("Orange color");
			break;
		
		case 'r':
		case 'R':
			System.out.println("Red color");
			break;
	
		default:
		System.out.println("Enter correct alpha");
	}
		System.out.println("...........The End............");
	}
	

}
