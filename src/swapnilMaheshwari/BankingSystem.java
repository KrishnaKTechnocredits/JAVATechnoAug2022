package swapnilMaheshwari;

public class BankingSystem 
{
	int bal;
	static int drCount=0;
	static int crCount=0;
	static int printBalance=0;
	int iDrCount=0;
	int iCrCount=0;
	
	void setUserDetails(String name, int intBal)
	{ 
		System.out.println("User Name is :"+name);
		bal=intBal;
		System.out.println("Initial balance is :"+bal);
	}
	
	void creditAmount (int crAmount)
	{
	 bal=bal+crAmount;
	 crCount++;
	 iCrCount++;
	}
	void debitAmount(int drAmount)
	{	bal=bal-drAmount;
		drCount++;
		iDrCount++;
	}
	void printBalance() 
	{
		System.out.println("Balance of the account is"+bal);
		printBalance++;
	}
	void individualTranscationSummary()
	{
		System.out.println("Individaul Dr count"+iDrCount);
		System.out.println("Individaul Cr count"+iCrCount);
	}
	void allTranscationSummary()
	{
		System.out.println("Total Dr count is"+drCount);
		System.out.println("Total Cr count is"+crCount);
	}
	
	public static void main(String[] args)
	{
		System.out.println("--------------User 1---------------------");
		System.out.println();
		BankingSystem bankingSystem1=new BankingSystem();
		bankingSystem1.setUserDetails("Swapnil", 2000);
		bankingSystem1.creditAmount(100);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.debitAmount(400);
		bankingSystem1.printBalance();
		bankingSystem1.individualTranscationSummary();
		System.out.println();
		
		System.out.println("--------------User 2---------------------");
		System.out.println();
		BankingSystem bankingSystem2=new BankingSystem();
		bankingSystem2.setUserDetails("Prashant", 10000);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.debitAmount(500);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.debitAmount(700);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.individualTranscationSummary();
		bankingSystem2.allTranscationSummary();
		bankingSystem2.printBalance();
	}
	
}
