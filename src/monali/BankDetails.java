package monali;
class BankDetails{
	int bal=10000;
	int countcredit=0,countdebit=0;
	
	void credit(int creditamnt)
	{
		
		bal=bal+creditamnt;
		countcredit++;
	}
	
	void debit(int debitamnt)
	{
		if(debitamnt<=bal)
		{
			bal=bal-debitamnt;
			countdebit++;
		}
		else
		{
			System.out.println("insufficient balance ,curent balance is " +debitamnt);
		}
	}
	
	void printBal()
	{
		System.out.println("Now your Current balance is " +bal);
	}
	
	void displaycountbal()
	{
		System.out.println("total debit count is " +countdebit);
		System.out.println("total credit count is " +countdebit);
	}
	
	public static void main(String[] args)
	{
		BankDetails bankdetails=new BankDetails();
		bankdetails.credit(1000);
		bankdetails.debit(500);
		bankdetails.credit(1500);
		bankdetails.debit(800);
		bankdetails.credit(200);
		bankdetails.debit(600);
		bankdetails.printBal();
		bankdetails.displaycountbal();
	}
}