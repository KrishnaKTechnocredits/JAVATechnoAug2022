package pallaviRaut;
//Assignment 3 debit credit count and balance 22Aug2022
class Bank{
	int creditCount;
	int debitCount;
	int balance=50000;
	
	void debitAmount(int amount)
	{
		if(amount<=balance)
		{
			balance=balance-amount;
			debitCount++;
		}
		else
		{
			System.out.println("InSufficient fund.");
		}
	}

	void creditAmount(int amount)
	{
		balance=balance+amount;
		creditCount++;
	}
	
	void printInfo()
	{
		System.out.println("Now Your current balance is :" +balance);
		System.out.println("Total Debit operations count: " +debitCount);
		System.out.println("Total Credit operations count: " +creditCount);
	}
	
	public static void main(String[] args)
	{
		Bank bank= new Bank();
		bank.debitAmount(2000);
		bank.creditAmount(7500);
		bank.debitAmount(1000);
		bank.creditAmount(2000);
		bank.creditAmount(3000);	
		bank.printInfo();	
	}
}