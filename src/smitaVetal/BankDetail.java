package smitaVetal;

class BankDetail{
	int bal = 10000;
	int debitCount;
	int creditCount;
	
	void debitAmount(int dAmt){
		if (dAmt<=bal)
		{
			bal=bal-dAmt;
			debitCount++;
		}
		else
		{
			System.out.println("You donot have sufficient Balance to withdraw " + dAmt);
		}
	}

	void creditAmount(int cAmt){
		bal = bal+cAmt;
		creditCount++;		
	}
	
	void printInfo(){
		System.out.println("Current Balance of your account is " + bal);
		System.out.println("Total Debit operation done is "+ debitCount);
		System.out.println("Total Credit operation done is " + creditCount);		
	}

	public static void main (String[] args){
		BankDetail bankdetail = new BankDetail();
		bankdetail.debitAmount(11000);
		bankdetail.printInfo();
		bankdetail.creditAmount(3000);
		bankdetail.printInfo();
		bankdetail.debitAmount(1000);
		bankdetail.printInfo();
		bankdetail.debitAmount(20000);
		bankdetail.debitAmount(100);
		bankdetail.creditAmount(400);
		bankdetail.printInfo();
	}
}