package nehaniG.Assignment11to15;

class BankSystem
{
	int debitCount;
	int creditCount;
	int printCount;
	static int debit;
	static int credit;
	static int print;
	static int balance;
	
	void setUserDetails(String user, int bal)
	{
		balance=bal;
		creditCount = 0;
		debitCount = 0;
		printCount = 0;
		System.out.println(user + " - Initial balance is : " + balance);
	}
	void creditAmount(int amount)
	{
		balance = balance + amount;
		credit++;
		creditCount++;
	}
	void debitAmount(int amount)
	{		
		balance = balance - amount;
		debit++;
		debitCount++;
	}
	void printBalance()
	{
		print++;
		printCount++;
		System.out.println("Available bal is : " +balance);
	}
	void individualTransactionSummary()
	{		
		System.out.println("Individual transaction summary : Credit - " + creditCount + " times, Debit - " + debitCount + " times, printBalance - " +printCount+ " time");
	}	
	void allTransactionSummary()
	{
		System.out.println("All Transaction Summary : Credit - " + credit + " times, Debit - " + debit + " times, printBalance - " +print+ " time");		
	}
	
	public static void main(String[] args)
	{
		BankSystem bankSystem1 = new BankSystem();
		bankSystem1.setUserDetails("user1", 10000);
		bankSystem1.creditAmount(500);
		bankSystem1.creditAmount(1500);
		bankSystem1.debitAmount(500);		
		bankSystem1.printBalance();
		bankSystem1.individualTransactionSummary();		
		
		System.out.println("\n");
		
		BankSystem bankSystem2 = new BankSystem();
		bankSystem2.setUserDetails("user2", 20000);
		bankSystem2.creditAmount(500);
		bankSystem2.creditAmount(1500);
		bankSystem2.creditAmount(200);
		bankSystem2.creditAmount(700);
		bankSystem2.creditAmount(100);
		bankSystem2.debitAmount(500);
		bankSystem2.debitAmount(300);
		bankSystem2.individualTransactionSummary();
		
		System.out.println("\n");
		
		bankSystem1.allTransactionSummary();
	}	
}