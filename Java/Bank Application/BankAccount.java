package bank;
import java.util.*;
import java.math.BigInteger;

class BankAccount implements BankoperationsInterface
{
	
	public String name;
	public BigInteger accountNumber; // Customer basic details to open bank account
	public double amount;
	
	public double transferLimit, withdrawLimit, depositLimit;
	public double transferedAmount, withdrawAmount, depositAmount; 
	
	// Different type of bank accounts withdraw,deposit and transfer limits 
	
	public double currentWithdrawalLimit = 100000,currentTransferLimit = 200000, currentDepositLimit = 200000;
	
	public double salaryWithdrawalLimit = 25000,salaryTransferLimit = 300000, salaryDepositLimit = 1000000;
	
	public double savingsWithdrawalLimit = 200000,savingsTransferLimit = 100000, savingsDepositLimit = 500000;
	
	public double depositAccountWithdrawalLimit = 200000,depositAccountTransferLimit = 500000, depositAccountDepositLimit = 500000;
	
	static Scanner sc = new Scanner(System.in);
	
	
	// To retrieve account balance
	
	@Override
	public double getBalance() 
	{
		// TODO Auto-generated method stub       
		return amount;
	}
	
	
	
	
	// To withdraw amount from account
	
	@Override
	public void withdrawAmount(double withdrawanAmount) 
	{
		// conditions to check withdraw amount and withdrawlimit
		
		if(amount >= withdrawanAmount && withdrawAmount + withdrawanAmount <= withdrawLimit)
		{
			amount = amount - withdrawanAmount;  // To decrease account balance
			
			withdrawAmount = withdrawAmount + withdrawanAmount;  // To increase withdraw  limit
			
			System.out.println("Amount Withdran ->" + withdrawanAmount);
		}
		else
		{
			System.out.println("You don't have enough balance in your bank account (or) Maximum withdraw limit exceeded");
		}		
	}
	
	
	
	// To deposit amount into account
	
	
	@Override
	public void depositAmount(double depoAmount) 
	{
		
		// Condition to check depositlimit
		
		if(depoAmount + depositAmount <= depositLimit)
		{
			amount = amount + depoAmount;  // To increase account balance
			
			depositAmount = depositAmount + depoAmount;  // To increase deposit limit
			
			System.out.println("Amount Deposited ->"+ depoAmount);
		}
		else
		{
			System.out.println("Your Maximum deposit limit is exceeded");
		}
		
	}
	
	
	
	// To transfer amount to another account
	
	
	@Override
	public void transferAmount(BankAccount account, double transferAmount) 
	{
		// TODO Auto-generated method stub
		if(transferedAmount + transferAmount <= transferLimit && transferAmount <= amount) 
		{
			account.amount = account.amount + transferAmount;  // To increase account balance in receiver account
			
			amount = amount - transferAmount; // To decrease account balance in sender account
			
			transferedAmount = transferedAmount + transferAmount;  // Increase transfer limit
			
			System.out.println("Amount Transfered -> "+ transferAmount +" to " + account.name);
		}
		else
			System.out.println("You don't have enough balance in your bank account (or) Maximum Transfer limit exceeded");
	}
		

	
	// While Transfering amount to another account, this will be used to choose receiver.  
	
	
	public static BankAccount chooseReciever(BigInteger accNumber)
	{
		for(BankAccount a : Menu.BankCustomers)
		{
			//System.out.println("a"+a.accountNumber+accNumber);
			if(accNumber.equals(a.accountNumber))   // if user entered customer existed in customers list then allowed to transfer amount.
				return a;
		}
		return null; // else null will return,user has to create new account
	}
	
	
	
	
	// It will check the existence of Customer account
	
	
	
	public static boolean existenceOfAccount(BigInteger accNumber)
	{
		for(int i = 0;i<Menu.BankCustomers.size();i++) 
		{
			
			
			if(accNumber.equals(Menu.BankCustomers.get(i).accountNumber))  // If customer found then will not allow to create new account.
			{
				return true; 
			}
		}
		
		return false;
	}
	
	
	
	// To get the account number of a customer
	
	
	public static BigInteger getAccountNumber()
	{
		System.out.println("Enter your Account Number:");
		BigInteger accNumber = sc.nextBigInteger();
		return accNumber;
		
	}
	
	
	
	

}



// This class will acquire all properties of its parent class Bank Account


class CurrentAccount extends BankAccount 
{
	
	public CurrentAccount(String name,BigInteger accNumber,double amount){
		
		super.withdrawLimit = this.currentWithdrawalLimit;
		super.depositLimit = this.currentDepositLimit;
		super.transferLimit = this.currentTransferLimit;
		this.name = name;
		this.accountNumber = accNumber;
		this.amount = amount;
		
	}


}

//This class will acquire all properties of its parent class Bank Account


class DepositAccount extends BankAccount 
{
	
	
	public DepositAccount(String name,BigInteger accNumber,double amount)
	{
		
		super.withdrawLimit = this.depositAccountWithdrawalLimit;
		super.depositLimit = this.depositAccountDepositLimit;
		super.transferLimit = this.depositAccountTransferLimit;
		this.name = name;
		this.accountNumber = accNumber;
		this.amount = amount;
	}

}



//This class will acquire all properties of its parent class Bank Account


class SalaryAccount extends BankAccount 
{
	
	public SalaryAccount(String name,BigInteger accNumber,double amount)
	{
		
		super.withdrawLimit = this.salaryWithdrawalLimit;
		super.depositLimit = this.salaryDepositLimit;
		super.transferLimit = this.salaryTransferLimit;
		this.name = name;
		this.accountNumber = accNumber;
		this.amount = amount;
	}

}


//This class will acquire all properties of its parent class Bank Account

class SavingsAccount extends BankAccount 
{
	
	public SavingsAccount(String name,BigInteger accountNumber,double amount)
	{
		super.withdrawLimit = this.savingsWithdrawalLimit;
		super.depositLimit = this.savingsDepositLimit;
		super.transferLimit = this.savingsTransferLimit;
		this.name = name;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

}









