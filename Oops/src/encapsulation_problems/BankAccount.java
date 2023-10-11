/*
  Write a Java program to create a 
  class called BankAccount 
  with private instance variables 
  accountNumber and balance. 
  Provide public getter and setter methods to access and modify these variables.
 */
package encapsulation_problems;

public class BankAccount {
	// private instance variables
	private long accountNumber;
	private int balance;
	
	public long getAccountNumber() 
	{
		return accountNumber;
	}
	
	public void setAccountNumber(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
}


