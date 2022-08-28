package titikshaG;
class BankDet
{
	int balance=10000;
	int debitCount=0;
	int creditCount=0;
	
	void debitAmt(int amt)
	{
		if(amt<=balance){
			balance=balance-amt;
		}
		else
		{
			System.out.println("Insufficient fund");
		}
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
		BankDet bankdetails=new BankDet();
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(500);
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(500);
		bankdetails.debitAmt(200);
		bankdetails.creditAmt(500);
		bankdetails.printInfo();
	}
}
	