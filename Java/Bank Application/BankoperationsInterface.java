package bank;

public interface BankoperationsInterface 
{
	
	// This interface Methods are implemented in Bank Account Class
	
	// These are the four basic operations to be performed on a bank account.
	
	double getBalance();  // To check account balance
	
	void withdrawAmount(double withdrawalAmount); // To withdraw amount from account 
	
	void depositAmount(double depositAmount);  // To deposit amount to account
	
	void transferAmount(BankAccount acc, double transferAmount);  // To transfer amount to another account

}
