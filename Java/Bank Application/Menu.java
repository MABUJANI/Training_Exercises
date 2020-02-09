package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu 
{
	static Scanner sc = new Scanner(System.in);
	static List<BankAccount> BankCustomers = new ArrayList<>();  // Storing List of Customers using ArrayList

	public static void main(String[] args) 
	{
		
		
		// TODO Auto-generated method stub
		
		System.out.println("----------- Welcome to HDFC Bank ------------");
		System.out.println("Choose any below options to use our bank services.");
		System.out.println(" 1. Create Account \n 2. Check Balance \n 3. Withdraw Amount \n 4. Deposit Amount \n 5. Transfer Amount \nEnter valid Option:" );
		
		int options = sc.nextInt();
		
		while(true)
		{
		
			switch(options)
				{
				
				case 1:
					Bankoperations.createAccount();
					break;
				case 2:
					Bankoperations.checkBalance();
					break;
				case 3:
					Bankoperations.withdraw();
					break;
				case 4:
					Bankoperations.deposit();
					break;
				case 5:
					Bankoperations.transfer();
					break;
				default:
					System.exit(0);
					
				}
				System.out.println(" 1. Create Account \n 2. Check Balance \n 3. Withdraw Amount \n 4. Deposit Amount \n 5. Transfer Amount \nEnter valid Option:" );
				options = sc.nextInt();
		}

	}

}
