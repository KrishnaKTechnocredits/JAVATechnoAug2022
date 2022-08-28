package hindaviIngle;
class BankDetails
{
	int bal=1000;
	int debitCount;
	int creditCount;
	
	void debitAmt(int amt)
	{
		if (amt<=bal)
		{
			bal=bal-amt;
			debitCount++;
			System.out.println("Debit amount balance is"+ bal);
		}
		else
		{
			System.out.println("insufficent balance"+ bal);
		}
	}
	void creditAmt(int amt)
	{
		bal = bal+amt;
		creditCount++;
	}
	void printInfo(){
		System.out.println("Current balance is "+bal);
		System.out.println("Debit count is "+debitCount);
		System.out.println("credit count is"+creditCount);
	}
	
public static void main(String[] a)
{
	BankDetails bankdetails = new BankDetails();
	bankdetails.debitAmt(500); //500
	bankdetails.debitAmt(100);//400
	bankdetails.creditAmt(500);//900
	bankdetails.creditAmt(100);//1000
	bankdetails.creditAmt(100);//1100
	bankdetails.printInfo();
	
}
}