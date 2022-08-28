package narendraD;

class BankTransactions{
	
	int debitCount;
	int creditCount;
	int currentBal = 500;
	
	
	void debitAmount(int debit ){
		if(debit<=currentBal)
		{
			currentBal = currentBal - debit;
			debitCount++;
		}else
		{
			System.out.println("Insufficient Fund");
		}
		
	}
	
	void creditAmount(int credit ){
		if(credit>=0)
		{
			currentBal = currentBal + credit;
			creditCount++;
		}else
		{
			System.out.println("Invalid Amount Entered");
		}
		
	}
	
	void printDetails(){
		System.out.println("Total Debit Count is " + debitCount);
		System.out.println("Total Credit Count is " + creditCount);
		System.out.println("Available Balance is " + currentBal );	
	}
	
	public static void main(String[] args){
		BankTransactions banktransaction = new BankTransactions();
		banktransaction.creditAmount(200);
		banktransaction.debitAmount(100);
		banktransaction.creditAmount(400);
        banktransaction.creditAmount(200);
		banktransaction.debitAmount(200);
		banktransaction.creditAmount(-100);
		banktransaction.debitAmount(20000);
		banktransaction.printDetails();
		
	}
}