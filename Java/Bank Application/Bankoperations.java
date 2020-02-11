package bank;

//import java.util.Scanner;
import java.math.BigInteger;
import java.util.*;

public class Bankoperations 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void createAccount()
	
	{
		
		System.out.println("Which type of account you want to create? \n 1. Savings \n 2. Current \n 3. Salary \n 4. Deposit \nEnter Option:");
		
		int option = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter your name:");
		String name = sc.nextLine();

		System.out.println("Enter account number:");
		BigInteger accountNumber = sc.nextBigInteger();
		//BigInteger returnValue = checkAccountNumber(accountNumber);
		
		
		// To check for valid bank account number
		
		BigInteger returnValue = checkAccountNumber(accountNumber);

		// To check existence of a bank account
	
		if(!BankAccount.existenceOfAccount(returnValue))
		{
		
			System.out.println("Enter initial amount:");
			double amount = sc.nextDouble();
			
		// To create bank account of different types using Parent Class Bank Account
		
			BankAccount account;
		
			switch(option)
				{
				case 1:
					account = new SavingsAccount(name,returnValue,amount);
					Menu.BankCustomers.add(account);  // adding customers to BankCustomers list
					System.out.println("Your Savings account created successfuly!!");
					break;
				case 2:
					account = new CurrentAccount(name,returnValue,amount);
					Menu.BankCustomers.add(account);
					System.out.println("Your Current account created successfuly!!");
					break;
				case 3:
					account = new SalaryAccount(name,returnValue,amount);
					Menu.BankCustomers.add(account);
					System.out.println("Your Salary account created successfuly!!");
					break;
				case 4:
					account = new DepositAccount(name,returnValue,amount);
					Menu.BankCustomers.add(account);
					System.out.println("Your Deposit account created successfuly!!");
					break;
				default:
					System.out.println("Enter valid option");
				
				}
		}
	
		else
		{
			System.out.println("Your account is existed in our bank with this account number");
		}
	}
	

	// To check account number validation
	
	
	public static BigInteger checkAccountNumber(BigInteger accountNumber)
	{
		int a = String.valueOf(accountNumber).length();
		BigInteger accountNumber1 = null;
		if(a!=10){
		//Checking account number length by converting from BigInteger to String
		while(a!=10){
			
		    System.out.println("Invalid Account Number,The account number should be of length 10");
			System.out.println("Enter desired account number:");
			accountNumber1 = sc.nextBigInteger();
			a = String.valueOf(accountNumber1).length();
			}
		return accountNumber1;
		}
		return accountNumber;
		
		
		
		
	}
	
	
	//To check account balance
	
	public static void checkBalance()
	{
		BigInteger accountNumber = BankAccount.getAccountNumber();  // first get account number
		BankAccount account = BankAccount.chooseReciever(accountNumber); // search account number in customer list
		
		if(account != null)  // if customer exist show balance
		{
			System.out.println("Account Balance: " + account.getBalance());
		}
		else
		{
			
			System.out.println("Account not exist!,Create a new account");
		}
		
	}
	
	
	
	// To withdraw amount
	
	
	public static void withdraw()
	{
		BigInteger accNumber = BankAccount.getAccountNumber();   // first get account number
		BankAccount account = BankAccount.chooseReciever(accNumber);  // search account number in customer list
		
		if(account != null)
		{
			System.out.println("Enter the amount to be withdrawn");
			int amount = sc.nextInt();
			account.withdrawAmount(amount);
		}
		else
		{
			
			System.out.println("Account not exist!,Create a new account");
		}
	}
	
	
	// To deposit amount
	
	
	public static void deposit()
	{
		BigInteger accNumber = BankAccount.getAccountNumber();
		BankAccount account = BankAccount.chooseReciever(accNumber);
		if(account != null) 
		{
			System.out.println("Enter the amount to deposit");
			int amount = sc.nextInt();
			account.depositAmount(amount);
		}
		else
		{
			
			System.out.println("Account not exist!,Create a new account");
		}
	}
	
	
	
	//To transfer amount to another account
	public static void transfer()
	{
		System.out.println("Enter your account number");
		BigInteger accNumber = sc.nextBigInteger();
		BankAccount account = BankAccount.chooseReciever(accNumber);
		
		if(account != null) 
		{
			
			System.out.println("Enter recivier account number");
			accNumber = sc.nextBigInteger();
			BankAccount recieverAccount = BankAccount.chooseReciever(accNumber);  // Check for receiver bank account
			
			if(recieverAccount != null) 
			{
				System.out.println("Enter the amount to transfer");
				int amount = sc.nextInt();
				account.transferAmount(recieverAccount, amount);
			}
			else
				System.out.println("Recivier account not found"); 
		}
		else
			System.out.println("Account not exist!,Create a new account");
	}
	
}
