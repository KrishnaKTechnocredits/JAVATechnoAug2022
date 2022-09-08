package swapnilMaheshwari.BankingOperations;

class BankOperations
{
	int bal=1000;
	int debitCount=0;
	int creditCount=0;
	
	void debitAmout(int amount)
	{
			if ( amount <= bal)
			{
				bal=bal-amount;
				debitCount++;
			}
			else
			{
				System.out.println("Insufficient fund");
			}
	}
	
	void creditAmount(int amount)
	{
				bal=bal+amount;
				creditCount++;
	}
	
	void printInfo()
	{
		System.out.println("The balance of the account is:" +bal);
		System.out.println("Debit transaction count is:"+debitCount);
		System.out.println("Credit transaction count is:"+creditCount);
	}
	
	public static void main (String[] args)
	{	
		BankOperations bankOperations= new BankOperations();
		bankOperations.debitAmout(800);
		bankOperations.creditAmount(1000);
		bankOperations.debitAmout(800);
		bankOperations.creditAmount(10000);
		bankOperations.debitAmout(800);
		bankOperations.debitAmout(800);
		bankOperations.creditAmount(1000);
		bankOperations.creditAmount(1000);
		bankOperations.printInfo();
	}
}