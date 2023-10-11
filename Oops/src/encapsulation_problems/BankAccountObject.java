package encapsulation_problems;

public class BankAccountObject {

	public static void main(String[] args) {
		
		// creating object
		BankAccount b1 = new BankAccount();
		
		// set values using setter method
		
		b1.setAccountNumber(917731849145L);
		b1.setBalance(200000);
		
		// get values using getter method
		
		long accountBalance = b1.getAccountNumber();
		int balance = b1.getBalance();
		
		// printing values 
		System.out.println("Your Account number = "+ accountBalance);
		System.out.println("Your Account balance = "+ balance);
	}

}
