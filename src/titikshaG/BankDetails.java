package titikshaG;
class BankDetails
{
	int balance=10000;
	int debitCount=0;
	int creditCount=0;
	
	void debitAmt(int amt)
	{
		balance=balance-amt;
		debitCount++;
	}
	
	void creditAmt(int amt)
	{
		balance=balance+amt;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println("Now to current balance is" + balance);
		System.out.println("Total debit operatopn:" + debitCount);
		System.out.println("Total credit operation:" + creditCount);
	}
	
	public static void main(String[] a)
	{
		BankDetails bankdetails=new BankDetails();
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(500);
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(500);
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(500);
		bankdetails.printInfo();
	}
}
	